package io.github.girirajvyas.ai.gpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.girirajvyas.ai.gpt.service.GptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
public class GptController {

	@Autowired
	private GptService gptService;
	
	@GetMapping("/search")
	@Operation(summary = "Fetch Account Information")
	public ResponseEntity<String> getAccounts(
			@Parameter(description = "Search Prompt", example = "What is todays date?") String promptText) {
		String response = gptService.getAccounts(promptText);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
