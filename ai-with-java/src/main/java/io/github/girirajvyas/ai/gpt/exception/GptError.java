package io.github.girirajvyas.ai.gpt.exception;

import lombok.Data;

@Data
public class GptError {

	private String code;
	private String param;
	private String message;
	private String type;
	
}
