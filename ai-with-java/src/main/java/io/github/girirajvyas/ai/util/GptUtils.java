package io.github.girirajvyas.ai.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import io.github.girirajvyas.ai.model.InputBody;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GptUtils {

	public static String sendQueryToOpenAI(String input, String endpoint, String apiKey, String model) {
		log.info("Input: {} for Endpoint: {}" + input, endpoint);
		JSONObject payload = getPayload(input, model);

		StringEntity inputEntity = new StringEntity(payload.toString(), ContentType.APPLICATION_JSON);

		HttpPost post = new HttpPost(endpoint);
		post.setEntity(inputEntity);
		post.setHeader("Authorization", "Bearer " + apiKey);
		post.setHeader("Content-Type", "application/json");

		// Send POST request and parse response
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {

			HttpEntity resEntity = response.getEntity();
			log.info(resEntity.toString());
			
			String resJsonString = new String(resEntity.getContent().readAllBytes(), StandardCharsets.UTF_8);
			JSONObject resJson = new JSONObject(resJsonString);
			log.info(resJson.toString());

			if (resJson != null && resJson.has("error")) {
				String errorMsg = resJson.optJSONObject("error").toString();

				// Scenarios where error message is not explicit and wrapped in message
				if (errorMsg == null) {
					errorMsg = resJson.optString("message");
				}
				log.error("Error Message: {}", errorMsg);
				return "Error Message: " + errorMsg;
			}

			log.info(resJsonString);

			// Parse JSON response
			JSONArray responseArray = resJson.getJSONArray("choices");
			List<String> responseList = new ArrayList<>();

			for (int i = 0; i < responseArray.length(); i++) {
				JSONObject responseObj = responseArray.getJSONObject(i);
				String responseString = responseObj.getJSONObject("message").getString("content");
				responseList.add(responseString);
			}

			// Convert response list to JSON and return it
			Gson gson = new Gson();
			String jsonResponse = gson.toJson(responseList);
			return jsonResponse;
		} catch (IOException | JSONException e) {
			log.error("Error sending request: {}", e.getMessage());
			return "Error: " + e.getMessage();
		}
	}

	private static JSONObject getPayload(String input, String model) {
		JSONObject payload = new JSONObject();
		payload.put("model", model); // model is important
		payload.put("messages", getMessageList(input));
		payload.put("temperature", 0.7);
		return payload;
	}

	private static JSONArray getMessageList(String input) {
		JSONObject message = new JSONObject();
		JSONArray messageList = new JSONArray();

		message.put("role", "user");
		message.put("content", input);
		messageList.put(message);
		return messageList;
	}

	public static String sendQueryToAzureOpenAI(String promptText, String endpoint, String apiKey, String model) {
		log.info("prompt created: {} for endpoint: {}", promptText, endpoint);
		// Rest Call
        HttpClient client = HttpClient.newHttpClient();
        String body = new Gson().toJson(InputBody.builder()
                .maxTokens(1605l).
                temperature(0.3f)
                .prompt(promptText)
                .model(model).build());
        HttpRequest request = HttpRequest.newBuilder()
                .header("API-KEY", apiKey)
                .uri(URI.create(endpoint))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        HttpResponse<String> response;

        try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());

			// Response Mapping
			JSONObject jsonObject = new JSONObject(response.body());
			log.info(jsonObject.toString());

//			int code;
			String responseText = "";

			if (StringUtils.isNotBlank(jsonObject.optString("error"))) {
				// Error Scenario
//				code = jsonObject.getJSONObject("error").getInt("code");
				responseText = (String) jsonObject.getJSONObject("error").get("message");
			} else {
				// Success Scenario
//				code = response.statusCode();
				JSONArray peopleArray = jsonObject.getJSONArray("choices");
				responseText = peopleArray.getJSONObject(0).getString("text");
			}

			return responseText;
		} catch (IOException | InterruptedException e) {
			log.error("Error sending request: {}", e.getMessage());
			return "Error: " + e.getMessage();
		}
		
	}
}
