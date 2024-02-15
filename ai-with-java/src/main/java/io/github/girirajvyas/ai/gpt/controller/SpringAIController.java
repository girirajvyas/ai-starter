package io.github.girirajvyas.ai.gpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.girirajvyas.ai.gpt.service.SpringAIService;
import io.github.girirajvyas.ai.model.PoetryDto;
import io.swagger.v3.oas.annotations.tags.Tag;

// Haiku: a Japanese poem of seventeen syllables, in three lines of five, seven, and five, traditionally evoking images of the natural world
@Tag(name = "Integrating GPT APIs via Spring-AI", description = "Demo GPT integration via poetry and cat Haiku  ")
@RestController
@RequestMapping("ai")
public class SpringAIController {

	private final SpringAIService springAIService;

	@Autowired
	public SpringAIController(SpringAIService springAIService) {
		this.springAIService = springAIService;
	}

	@GetMapping("/cathaiku")
	public ResponseEntity<String> generateHaiku() {
		return ResponseEntity.ok(springAIService.getCatHaiku());
	}

	@GetMapping("/poetry")
	public ResponseEntity<PoetryDto> generatePoetry(@RequestParam("genre") String genre,
			@RequestParam("theme") String theme) {
		return ResponseEntity.ok(springAIService.getPoetryByGenreAndTheme(genre, theme));
	}

}
