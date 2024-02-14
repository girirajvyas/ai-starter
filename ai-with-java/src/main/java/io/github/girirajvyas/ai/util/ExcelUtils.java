package io.github.girirajvyas.ai.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		// Path to the Excel file
		String filePath = "src/main/resources/chat_gpt_prompts.xlsx";
		System.out.println("Processing of prompts started");
		// Read from Excel file
		processPromptsInExcelFile(filePath);
		System.out.println("Processing of prompts Completed");
	}

	private static void processPromptsInExcelFile(String filePath) {
		try {
			InputStream is = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);

			// Read data from column 1 and write response to column 2
			for (Row row : sheet) {
				Cell inputCell = row.getCell(0);
				if (inputCell != null) {
					String input = "";
					if (inputCell.getCellType() == CellType.STRING) {
						input = inputCell.getStringCellValue();
					} else if (inputCell.getCellType() == CellType.NUMERIC) {
						input = String.valueOf(inputCell.getNumericCellValue());
					}

					// Process the input and get the response
					String response = processInput(input);

					Cell responseCell = row.createCell(1);
					responseCell.setCellValue(response);
				}
			}

			is.close();

			// Save the changes to the Excel file
			FileOutputStream fos = new FileOutputStream(filePath);
			workbook.write(fos);
			fos.close();
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String processInput(String input) {
		// Process the input and return the response
		String apiUrl = YamlUtils.getNestedProperty("generativeai.gpt3.api");
		String apiKey = YamlUtils.getNestedProperty("generativeai.gpt3.key");
		String output = GptUtils.sendQueryToOpenAI(input, apiUrl, apiKey, "gpt-3.5-turbo");
		return output;
	}

}
