package io.github.girirajvyas.ai.gpt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.github.girirajvyas.ai.util.GptUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GptServiceImpl implements GptService {

	@Value("${generativeai.gpt3.api}")
	private String apiUrl;

	@Value("${generativeai.gpt3.key}")
	private String apiKey;

	public String getAccounts(String promptText) {
		String response = GptUtils.sendQuery(promptText, apiUrl, apiKey);
		log.info(response);
		return response;
	}
}
