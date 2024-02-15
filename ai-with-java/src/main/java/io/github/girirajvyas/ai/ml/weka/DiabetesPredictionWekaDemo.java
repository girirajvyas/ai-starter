package io.github.girirajvyas.ai.ml.weka;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.Logistic;
import weka.classifiers.functions.SimpleLinearRegression;
import weka.classifiers.functions.SimpleLogistic;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

import java.io.File;

public class DiabetesPredictionWekaDemo {

    public static void main(String[] args) throws Exception {
        // Load CSV file with training data
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("./pima-indians-diabetes-dataset/diabetes-data.csv"));
        Instances data = loader.getDataSet();

        // Set class attribute
        if (data.classIndex() == -1) {
            data.setClassIndex(data.numAttributes() - 1);
        }

        // Build classifier
        Classifier classifier = new Logistic();
//        Classifier classifier = new SimpleLogistic();
//        Classifier classifier = new SimpleLinearRegression();
        classifier.buildClassifier(data);

        // Perform cross-validation
        Evaluation eval = new Evaluation(data);
        eval.crossValidateModel(classifier, data, 10, new java.util.Random(1));
        System.out.println(eval.toSummaryString("\nResults\n======\n", false));

        // Make predictions
        for (int i = 0; i < 10; i++) {
            Instance instance = data.instance(i);
            double pred = classifier.classifyInstance(instance);
            System.out.println("Instance " + (i + 1) + ": Actual=" + instance.stringValue(instance.classIndex()) + ", Predicted=" + data.classAttribute().value((int) pred));
        }
    }
}

