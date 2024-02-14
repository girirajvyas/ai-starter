package io.github.girirajvyas.ai.ml.weka;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.Logistic;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

import java.io.File;

public class DiabetesPredictionWekaDemo {

    public static void main(String[] args) throws Exception {
        // Load CSV file
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("./pima-diabetes-data/pima-data.csv"));
        Instances data = loader.getDataSet();

        // Set class attribute
        if (data.classIndex() == -1) {
            data.setClassIndex(data.numAttributes() - 1);
        }

        // Build classifier
        Classifier classifier = new Logistic();
        classifier.buildClassifier(data);

        // Perform cross-validation
        Evaluation eval = new Evaluation(data);
        eval.crossValidateModel(classifier, data, 10, new java.util.Random(1));
        System.out.println(eval.toSummaryString("\nResults\n======\n", false));

        // Make predictions
        for (int i = 0; i < data.numInstances(); i++) {
            Instance instance = data.instance(i);
            double pred = classifier.classifyInstance(instance);
            System.out.println("Instance " + (i + 1) + ": Actual=" + instance.stringValue(instance.classIndex()) + ", Predicted=" + data.classAttribute().value((int) pred));
        }
    }
}

