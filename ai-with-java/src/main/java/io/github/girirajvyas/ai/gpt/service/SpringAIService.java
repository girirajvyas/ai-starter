package io.github.girirajvyas.ai.gpt.service;

import io.github.girirajvyas.ai.model.PoetryDto;

public interface SpringAIService {
	
	 String getCatHaiku();

	 PoetryDto getPoetryByGenreAndTheme(String genre, String theme);

}
