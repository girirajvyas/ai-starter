# ai-with-java
Project for GPT Api consumption


**1. Overview of Artificial Intelligence and its applications**

**Overview**  
Artificial Intelligence (AI) is a branch of computer science that focuses on creating systems capable of performing tasks that would normally require human intelligence. These tasks include learning, reasoning, problem-solving, perception, and language understanding. AI applications span a wide range of industries, including healthcare, finance, gaming, and more.

**Applications of AI:**  
- **Natural Language Processing (NLP):** Understanding and processing human language.
- **Computer Vision:** Teaching machines to interpret and understand visual information.
- **Machine Learning:** Algorithms that enable computers to learn patterns and make predictions.
- **Speech Recognition:** Converting spoken language into text.
- **Recommendation Systems:** Suggesting items based on user preferences.
- **Autonomous Vehicles:** Using AI to enable self-driving cars.

**2. Integration of AI with Java: libraries, frameworks, and tools available.**

**Java Libraries for AI:**  
Java provides several libraries and frameworks for AI development:

- **Deeplearning4j:** A deep learning library for Java and Scala.
  ```java
  // Example using Deeplearning4j
  MultiLayerNetwork model = new MultiLayerNetwork(config);
  model.fit(trainingData);
  ```

- **Weka:** A collection of machine learning algorithms for data mining tasks.
  ```java
  // Example using Weka
  J48 decisionTree = new J48();
  decisionTree.buildClassifier(trainingData);
  ```

- **Encog:** An advanced machine learning framework.
  ```java
  // Example using Encog
  BasicNetwork network = new BasicNetwork();
  network.addLayer(new BasicLayer(null, true, 4));
  network.addLayer(new BasicLayer(new ActivationSigmoid(), true, 6));
  network.addLayer(new BasicLayer(new ActivationSigmoid(), false, 2));
  network.getStructure().finalizeStructure();
  network.reset();
  ```

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
	- Emailid
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

```java
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWriteExample {
    public static void main(String[] args) {
        // Path to the Excel file
        String filePath = "path/to/your/excel/file.xlsx";

        // Read from Excel file
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            // Read data from each row and column
            for (Row row : sheet) {
                for (Cell cell : row) {
                    CellType cellType = cell.getCellType();
                    if (cellType == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    } else if (cellType == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    } else if (cellType == CellType.BOOLEAN) {
                        System.out.print(cell.getBooleanCellValue() + "\t");
                    }
                }
                System.out.println();
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write to Excel file
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Write data to specific rows and columns
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello");
            cell = row.createCell(1);
            cell.setCellValue("World");

            row = sheet.createRow(1);
            cell = row.createCell(0);
            cell.setCellValue(42);
            cell = row.createCell(1);
            cell.setCellValue(3.14);

            workbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Make sure you have the Apache POI library (poi-ooxml) added to your project's dependencies before running this code. You can download the library from the Apache POI website (https://poi.apache.org/).

In this example, the code reads from an existing Excel file and prints the data to the console. Then it creates a new Excel file and writes some data to it. You can modify the code to suit your specific requirements.

Remember to replace `"path/to/your/excel/file.xlsx"` with the actual file path you want to read from or write to.

I hope this helps you get started with Excel read/write operations in Java! Let me know if you have any further questions.

 
# Reference:
 - https://www.infoworld.com/article/3697151/build-a-java-application-to-talk-to-chatgpt.html