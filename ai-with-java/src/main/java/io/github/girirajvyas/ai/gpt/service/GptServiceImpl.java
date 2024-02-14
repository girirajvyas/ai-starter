package io.github.girirajvyas.ai.gpt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.github.girirajvyas.ai.util.GptUtils;

@Service
public class GptServiceImpl implements GptService {

	@Value("${generativeai.gpt3.open-ai.endpoint}")
	private String endpoint;

	@Value("${generativeai.gpt3.open-ai.key}")
	private String apiKey;

	@Value("${generativeai.gpt3.open-ai.model}")
	private String model;

	@Value("${generativeai.gpt3.azure-open-ai.endpoint}")
	private String azureEndpoint;

	@Value("${generativeai.gpt3.azure-open-ai.key}")
	private String azureApiKey;

	@Value("${generativeai.gpt3.azure-open-ai.model}")
	private String azureModel;

	@Override
	public String getAccounts(String promptText) {
		return GptUtils.sendQueryToOpenAI(promptText, endpoint, apiKey, model);
	}

	@Override
	public String getInterviewQuestions(String promptText) {
		return GptUtils.sendQueryToAzureOpenAI(promptText, azureEndpoint, azureApiKey, azureModel);
	}
}
