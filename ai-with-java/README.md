# ai-with-java
Project for showcasing different usecases of AI with Java

 - Frameworks, Libraries and Tools
 - ChatGPT Integration

## Frameworks, Libraries and Tools

### Based on use-case
**Knowledge-based and Reasoning Systems Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|-------|-------------|----------|------------------|-----------------|----------------|------------------|---------|------|-----|
| Apache Jena | It offers a framework for developing semantic web and linked data applications | Apache 2.0 | [Apache Jena](https://jena.apache.org/) | 2001 | 3.17.0 (2021) | IBM, HP, Netflix | Researchers, Developers | Easily integrates with Java applications, Well-documented | The learning curve may seem steep for some developers |
| PowerLoom | It supports a high-level, declarative, logic-based language | Apache 2.0 | [PowerLoom](https://sites.google.com/site/ubcsail/Home/resources) | 2000 | Version 2.1.2 (2004) | NASA, Boeing | Researchers, Developers | An interpreted and compiled language with a convenient text-based syntax | Development appears to have ceased |
| d3web | It is for creating, deploying and maintaining knowledge-based systems | GPL-3.0 License | [d3web](https://www.d3web.de/) | Not Available | Not Available | Not Available | Researchers, Developers | Rich sets of features for the creation of knowledge-based systems | Limited community support |
| Eye | It is a reasoning engine supporting the Semantic Web layers | GPL License | [Eye](http://eulersharp.sourceforge.net/eye) | Not Available | 2.5 (2019) | Not Available | Researchers, Developers | It combines forward and backward reasoning | Lacks solid documentation |
| Tweety | It is a collection of various Java libraries for logical aspects of artificial intelligence | LGPL-3.0 License | [Tweety](http://tweetyproject.org/) | Not Available | 1.14 (2020) | Not Available | Researchers, Developers | Covers a broad range of logical formalisms | Limited community support |

Note: "Not Available" indicates the data is not publicly available or could not be found.

**Neural Networks Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Neuroph | It is lightweight Java neural network framework | Apache 2.0 | [Neuroph](http://neuroph.sourceforge.net/) | 2008 | 2.96 (2015) | Not Available | Researchers, Developers | Simple and easy to understand, Supports multi-layer perceptrons, Hopfield networks | Not as comprehensive as some other libraries |
| Deeplearning4j | It is designed to be used in business environments, rather than as a research tool | Apache 2.0 | [Deeplearning4j](https://deeplearning4j.org/) | 2014 | 1.0.0-beta7 (2020) | IBM, Microsoft,     Uber, Apple | Companies, Researchers | Aligned with Java's ecosystem, Supports GPU to boost performance | Steep learning curve, Not as widespread as Python-based frameworks |

Note: "Not Available" indicates the data is not publicly available or could not be found.

**Natural Language Processing Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Apache OpenNLP | It is a machine learning toolkit for processing natural language text | Apache 2.0 | [Apache OpenNLP](https://opennlp.apache.org/) | 2004 | 1.9.3 (2020) | IBM, Intel , Yahoo | Researchers, Developers | Extensible and supports user-defined models | Limited language support compared to similar Python libraries |
| Stanford CoreNLP | It provides a set of natural language analysis tools | GPL-3.0 | [Stanford CoreNLP](https://stanfordnlp.github.io/CoreNLP/) | 2010 | 4.2.2 (2021) | SAP, Apple , Barclays | Researchers, Developers | Big community, Multi-language support | Less user-friendly for beginners |

**Machine Learning and Data Science Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Java-ML | It provides a collection of machine learning algorithms | LGPL-3.0 | [Java-ML](https://java-ml.sourceforge.net/) | 2008 | 0.1.7 (2012) | Not Available | Researchers, Developers | Simplicity of use for Naive Bayes, k-NN, PCA, etc., algorithms, Comprehensive documentation | Library seems to be discontinued, Limited algorithm support |
| RapidMiner | It is a data science platform that includes many machine learning algorithms | AGPLv3 | [RapidMiner](https://rapidminer.com/) | 2006 | 9.10 (2021) | BMW, Samsung, Airbus | Companies, Data scientists | Simplifies the process of model development, Offers a graphical interface | Closed corporate structure |
| Weka | It provides a collection of tools for data mining and machine learning algorithms | GPL-3.0 | [Weka](https://www.cs.waikato.ac.nz/ml/weka/) | 1997 | 3.8.5 (2021) | Amazon, Pentagon, NZ Ministry of Health | Researchers, Data scientists | Easy to use GUI, Wide algorithm support | Poor performance on large datasets |
| Encog | It supports many advanced algorithms, neural networks & SVMs | Apache 2.0 | [Encog](https://www.heatonresearch.com/encog/) | 2008 | 3.4 (2015) | Not Available | Researchers, Developers | Active development community, GUI for training | Software has been discontinued |
| H2O | It is a multipurpose library for machine learning applications | Apache 2.0 | [H2O AI](https://www.h2o.ai/) | 2012 | 3.32.1.3 (2021) | AT&T, Scientific Games, Comcast | Companies, Data scientists | Supports parallel processing, Web-based interactive graphical interface | Interface may be confusing to some |
| Mahout | It offers a mathematically expressive Scala DSL | Apache 2.0 | [Mahout](https://mahout.apache.org/) | 2009 | 0.14.3 (2020) | Adobe, Yahoo, Twitter | Companies, Developers | Linear algebra library, Rich in algorithms, Efficient in-memory computations | Requires understanding of MapReduce |

**Genetic Algorithms Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Jenetics | It is an advanced Genetic Algorithm, Evolutionary Algorithm and Genetic Programming library | Apache 2.0 | [Jenetics](http://jenetics.io/) | 2010 | 6.1.0 (2020) | Not Available | Researchers, Developers | High level of customization, Integration with java streams API, extensive documentation | More suited for advanced users |
| Watchmaker | It is a framework for implementing platform-independent evolutionary algorithms | Apache 2.0 | [Watchmaker](http://watchmaker.uncommons.org/) | 2006 | 0.7.1 (2011) | Not Available | Researchers, Developers | Multithreaded evolution engine, Pluggable selection strategies | Not under active development |
| ECJ 23 | It is a research EC system designed to be highly flexible |  Apache 2.0 | [ECJ](http://cs.gmu.edu/~eclab/projects/ecj/) | 1998 | 27 (2019) | Not Available | Researchers, Developers | Rich functionality, large-scale, multi-objective optimization | The structure can be complex to new users |
| JGAP | It provides a Genetic Algorithms component | GPL | [JGAP](http://jgap.sourceforge.net/) | 2002 | 3.6.3 (2012) | Not Available | Researchers, Developers | Broad functionality for genetic algorithms | Not under active development |
| Eva | It's designed for running computational evolutions | GPL-3.0 | [Eva](https://www.evavolution.com/) | Not Available | Not Available | Not Available | Researchers, Developers | Simple structure, Modularity | Limited community support |

**Automatic Programming Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Acceleo | It provides a pragmatic way to develop code generators in a incremental way | EPL-1.0 | [Acceleo](https://www.eclipse.org/acceleo/) | 2006 | 3.7.13 (2021) | Not Available | Developers | Integration with Eclipse IDE, incremental generation approach | Limited outside Eclipse ecosystem |

**Application Development Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Spring Roo | It is a rapid application development tool for Java developers | Apache 2.0 | [Spring Roo](https://spring.io/projects/spring-roo) | 2009 | 2.0.0 (2018) | IBM, MIT, GE Healthcare | Developers | Follows the convention over configuration principle, Integration with Spring framework | Limited active community support |

**Data Mining Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| ELKI | It allows the combination of different mining algorithms, distance functions or indices | AGPLv3 | [ELKI](https://elki-project.github.io/) | 2008 | 0.7.5 (2019) | Not Available | Researchers, Developers | Modular architecture, Infinite parameterizable | Not as user-friendly compared to other data mining tools |

**Advanced Scientific Computation Libraries Table**

| Library Name | Description | License | Official Website | First Release | Latest Release | Companies Adopting this | Used by | Pros | Cons |
|--------------|-------------|---------|------------------|---------------|----------------|-----------------------|---------|------|-----|
| Meta Numerics | It is a library for advanced scientific computation, including complex numbers, matrices, Advanced Math, and statistics | Microsoft Public License (MS-PL) | [Meta Numerics](http://metanumerics.codeplex.com/) | 2009 | 3.1 (2014) | Not Available | Researchers, Developers | Comprehensive numerics library, Small memory footprint | Rare updates, Small community|

Note: "Not Available" indicates the data is not publicly available or could not be found.

### Python Equivalent libraries in Java 

| Python Library | Python Library Description | Equivalent Java Library | Java Library Description | Production Use Case | Latest version and release date |
| --- | --- | --- | --- | --- | --- |
| [TensorFlow](https://www.tensorflow.org/) | An open-source machine learning framework developed by Google. | [DJL](https://djl.ai/) | An open-source library developed by Amazon, is more user-friendly. | Used for creating large-scale, neural networks models. | TensorFlow: 2.8.0 (31 Jan, 2022) DJL: 0.15.0 (Jan 10, 2022) |
| [Keras](https://keras.io/) | An open-source Python library that provides a convenient way to define and train any machine learning model. | [DL4J](https://deeplearning4j.org/) | A Java library for deep learning. DL4j stands for Deep Learning for Java. | Used in conjunction with neural networks and deep learning models. | Keras: 2.6.0 (Aug 12, 2021) DL4J: 1.0.0-beta7 (Aug, 2020) |
| [PyTorch](https://pytorch.org/) | A machine learning library developed by Facebook's AI Research lab. | [DJL](https://djl.ai/) | An open-source library developed by Amazon. | Used for applications in computer vision and natural language processing. | PyTorch: 1.10.0 (Oct 19, 2021) DJL: 0.15.0 (Jan 10, 2022) |
| [Scikit-Learn](https://scikit-learn.org/) | A machine learning library offering simple and efficient tools for data mining and data analysis. | [Weka](https://waikato.github.io/) or [MOA](https://moa.cms.waikato.ac.nz/) | Java software for machine learning, fully integrated with Weka, designed to deal with large-scale machine learning. | Used for data mining, data analysis and prediction modeling. | Scikit-Learn: 1.0.2 (Jan 16, 2022) Weka: 3.8.5 (Nov 27, 2021) MOA: 2019.05.0 (May 14, 2019) |
| [XGBoost](https://xgboost.readthedocs.io/) | An optimized distributed gradient boosting library. | [XGBoost](https://xgboost.readthedocs.io/) | XGBoost also has a Java wrapper. | Used to improve speed and model performance. | XGBoost: Python wrapper 1.5.0 (Oct 31, 2021) Java wrapper 0.90 (Jan 14, 2020) |
| [LightGBM](https://lightgbm.readthedocs.io/) | A gradient boosting framework that uses tree-based learning algorithms. | [LightGBM](https://lightgbm.readthedocs.io/) | Like XGBoost, LightGBM also has a java wrapper. | Gradient boosting and higher efficiency models | LightGBM: 3.3.1 (Nov 5, 2021) Java wrapper not separately versioned |
| [Pandas](https://pandas.pydata.org/) | A library for data manipulation and analysis. | [Tablesaw](https://github.com/jtablesaw/tablesaw) | Java dataframe and data science library. | Data manipulation and analysis | Pandas: 1.4.0 (Dec 31, 2021) Tablesaw: 0.38.3 (Sep 17, 2021) |
| [NumPy](https://numpy.org/) | A library for large, multi-dimensional arrays and matrices, along with a collection of mathematical functions for these arrays. | [ND4J](https://nd4j.org/) | N-Dimensional Arrays for Java. | Used for scientific computing with Python.| NumPy: 1.22.3 (Dec 30, 2021) ND4J: 1.0.0-beta7 (Aug 30, 2020) |
| [Matplotlib](https://matplotlib.org/)/[Seaborn](https://seaborn.pydata.org/) | Libraries for data visualization. | [XChart](https://knowm.org/open-source/xchart/)/[JFreeChart](http://www.jfree.org/jfreechart/) | A light-weight and convenient library for plotting data. | Visualizing data in forms of different types of plots. | Matplotlib: 3.5.1 (Dec 18, 2021) Seaborn: 0.11.2 (July 6, 2021) XChart: 3.8.4 (Aug 17, 2021) JFreeChart: 1.5.3 (Dec 31, 2021) |
| [NLTK (Natural Language Toolkit)](https://www.nltk.org/) | A platform to work with human language data that provides interfaces to over 50 corpora and lexical resources. | [Apache OpenNLP](https://opennlp.apache.org/) or [Stanford NLP](https://nlp.stanford.edu/) | Provides services for sentence detection, tokenization, pos-tagging, chunking and parsing, named entity detection etc. | Text analytics, language processing | NLTK: 3.6.6 (Jan 31, 2022) Apache OpenNLP: 1.9.3 (Dec 31, 2019) Stanford NLP: v4.4.1 (Nov 12, 2021) |

**Tools for AI Development:**  
- **Apache OpenNLP:** A toolkit for processing natural language text.
- **DL4J UI:** Deeplearning4j's user interface for model training visualization.
- **Weka Explorer:** GUI tool for exploring machine learning datasets.

**3. Importance of Java in AI development and its advantages.**

**Importance of Java in AI:**
- **Platform Independence:** Java's "write once, run anywhere" principle makes it suitable for deploying AI models across different platforms.
- **Rich Ecosystem:** Java has a vast ecosystem of libraries and tools that facilitate AI development.
- **Scalability:** Java's scalability is crucial for handling complex AI algorithms and large datasets.
- **Community Support:** Java has a strong developer community, providing continuous support and resources for AI developers.

**Advantages of Using Java in AI:**  
- **Enterprise Adoption:** Java is widely used in enterprise environments, making it easier to integrate AI solutions into existing systems.
- **Performance:** Java's performance optimizations and Just-In-Time (JIT) compilation contribute to efficient AI execution.
- **Security:** Java's built-in security features enhance the trustworthiness of AI applications.
- **Mature Ecosystem:** Java's mature and stable ecosystem ensures reliable development and maintenance of AI projects.


## ChatGPT API Integration

### Account creation
 - Create account with Chat GPT
	- Email id
	- Mobile number verification
	- Done

### API Keys
 - Generate API Keys: https://platform.openai.com/account/api-keys
 - Note: Message when you login to account and check usage: https://platform.openai.com/account/usage
   - `In order to use the OpenAI API, you need to set up a paid account.`

### Project setup
 - The key generated above should be passed at application.yml in `generativeai.gpt3.key`

### Redo Prompts

Prompt: Can you help in creating the excel read/write code for java?
Certainly! I can help you with reading from and writing to Excel files using Java. To accomplish this, you'll need to use a library that provides Excel-related functionality. One popular library for this purpose is Apache POI. Here's an example code snippet that demonstrates how to read from and write to an Excel file using Apache POI:

Make sure you have the Apache POI library (poi-ooxml) added to your project's dependencies before running this code. You can download the library from the Apache POI website (https://poi.apache.org/).

In this example, the code reads from an existing Excel file and prints the data to the console. Then it creates a new Excel file and writes some data to it. You can modify the code to suit your specific requirements.

Remember to replace `"path/to/your/excel/file.xlsx"` with the actual file path you want to read from or write to.

I hope this helps you get started with Excel read/write operations in Java! Let me know if you have any further questions.
 
# Reference:
 - https://www.baeldung.com/java-ai
 - https://www.bairesdev.com/blog/best-java-machine-learning-libraries/
 - https://www.infoworld.com/article/3697151/build-a-java-application-to-talk-to-chatgpt.html
 - Spring-ai
   - https://docs.spring.io/spring-ai/reference/concepts.html
   - https://medium.com/dandelion-tutorials/spring-ai-with-ollama-and-metas-llama2-764dcde77bf9
   - code references:
     - https://github.com/eugenp/tutorials/tree/master/spring-ai
     - https://www.unlogged.io/post/all-you-need-to-know-about-spring-ai
 - Langchain for Java
   - https://www.baeldung.com/java-langchain-basics
   
