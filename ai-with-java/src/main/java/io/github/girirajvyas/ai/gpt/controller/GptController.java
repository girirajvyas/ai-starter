package io.github.girirajvyas.ai.gpt.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import io.github.girirajvyas.ai.gpt.service.GptService;
import io.github.girirajvyas.ai.model.InputBody;
import io.github.girirajvyas.ai.model.InterviewModel;
import io.micrometer.common.util.StringUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class GptController {
	
    private final String serviceUrl = "https://aoai-engx-hack23.openai.azure.com/openai/deployments/gpt-35-turbo/completions?api-version=2023-07-01-preview";
    private final String API_KEY = "";

	@Autowired
	private GptService gptService;
	
	@GetMapping("/search")
	@Operation(summary = "Fetch Account Information")
	public ResponseEntity<String> getAccounts(
			@Parameter(description = "Search Prompt", example = "What is todays date?") String promptText) {
		String response = gptService.getAccounts(promptText);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PostMapping("/interview")
    @Operation(summary = "Helps in getting interview questions for the preparation")
    public ResponseEntity<Object> interview(@RequestBody InterviewModel interviewModel) throws IOException, InterruptedException {
		// Prompt Creation
        String prompt = "As a " + interviewModel.getRole() + "  Having experience of: " + interviewModel.getYearOfExperience() + "  " +
                "Can you suggest the interview questions focused on interview?";
        log.info("searching " + prompt);
        
        // Rest Call
        HttpClient client = HttpClient.newHttpClient();
        String body = new Gson().toJson(InputBody.builder()
                .maxTokens(1605l).
                temperature(0.3f)
                .prompt(prompt)
                .model("gpt-35-turbo").build());
        HttpRequest request = HttpRequest.newBuilder()
                .header("API-KEY", API_KEY)
                .uri(URI.create(serviceUrl))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Response Mapping
        JSONObject jsonObject = new JSONObject(response.body());
        log.info(jsonObject.toString());
        
        int code;
        String responseText="";
        
        if(StringUtils.isNotBlank(jsonObject.optString("error"))) {
        	// Error Scenario
        	code =  jsonObject.getJSONObject("error").getInt("code");
        	responseText = (String) jsonObject.getJSONObject("error").get("message");
        } else {
        	// Success Scenario
        	code = response.statusCode();
        	JSONArray peopleArray = jsonObject.getJSONArray("choices");
            responseText = peopleArray.getJSONObject(0).getString("text");	
        }    
        
        return ResponseEntity.status(code)
                .header(response.headers().toString())
                .body(responseText);
    }

}
