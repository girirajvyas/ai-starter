package io.github.girirajvyas.ai.gpt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.github.girirajvyas.ai.gpt.service.GptService;
import io.github.girirajvyas.ai.model.InterviewModel;
import io.github.girirajvyas.ai.model.OperationtsEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Tag(name = "Integrating GPT APIs Directly", description = "Demo different use cases of direct search and interview questions")
@Slf4j
@RestController
public class GptController {

	@Autowired
	private GptService gptService;

	@GetMapping("/search")
	@Operation(summary = "Search for data using prompts")
	public ResponseEntity<String> search(
			@Parameter(description = "Search Prompt", example = "What is todays date?") String promptText) {
		String response = gptService.searchPrompt(promptText);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/interview")
	@Operation(summary = "Helps in getting interview questions for the preparation")
	public ResponseEntity<String> interview(@RequestBody InterviewModel interviewModel)
			throws IOException, InterruptedException {
		// Prompt Creation
		String prompt = "As a " + interviewModel.getRole() + "  Having experience of: "
				+ interviewModel.getYearOfExperience() + "  "
				+ "Can you suggest the interview questions focused on interview?";
		String response = gptService.getInterviewQuestions(prompt);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@RequestMapping(path = "/file-operations/", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@Operation(summary = "Find Sentiment or Summary of provided file for easy consumption")
	public ResponseEntity<String> fileOperations(@RequestParam("file") MultipartFile file,
			@RequestParam OperationtsEnum operationtsEnum) throws IOException {
		String query = OperationtsEnum.getSearchText(operationtsEnum.name());
		InputStream initialStream = file.getInputStream();

		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(initialStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String data = resultStringBuilder.toString();
		String prompt = query + data;
		log.info("final prompt: ",prompt);
		
		String response = gptService.searchPrompt(prompt);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
