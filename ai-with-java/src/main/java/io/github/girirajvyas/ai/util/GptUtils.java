package io.github.girirajvyas.ai.util;

import java.io.IOException;
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

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GptUtils {

	public static String sendQuery(String input, String endpoint, String apiKey) {
		log.info("Message sent for input: " + input);
	    JSONObject payload = getPayload(input);

	    StringEntity inputEntity = new StringEntity(payload.toString(), ContentType.APPLICATION_JSON);

	    HttpPost post = new HttpPost(endpoint);
	    post.setEntity(inputEntity);
	    post.setHeader("Authorization", "Bearer " + apiKey);
	    post.setHeader("Content-Type", "application/json");

	    // Send POST request and parse response
	    try (CloseableHttpClient httpClient = HttpClients.createDefault();
	      CloseableHttpResponse response = httpClient.execute(post)) {
	    	
	        HttpEntity resEntity = response.getEntity();
	        log.info(response.getEntity().toString());
	        String resJsonString = new String(resEntity.getContent().readAllBytes(), StandardCharsets.UTF_8);
	        JSONObject resJson = new JSONObject(resJsonString);
	        log.info(resJson.toString());
	        
	        if (resJson.has("error")) {
	          JSONObject errorMsg = resJson.getJSONObject("error");
	          log.error("Error Message: {}", errorMsg);
	          return "Error Message: " + errorMsg;
	        }

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

	private static JSONObject getPayload(String input) {
		JSONObject payload = new JSONObject();
	    payload.put("model", "gpt-3.5-turbo"); // model is important
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
}
