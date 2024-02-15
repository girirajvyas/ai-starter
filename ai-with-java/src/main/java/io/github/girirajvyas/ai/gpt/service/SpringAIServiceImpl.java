package io.github.girirajvyas.ai.gpt.service;

import org.springframework.ai.client.AiClient;
import org.springframework.ai.client.AiResponse;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.girirajvyas.ai.model.PoetryDto;


@Service
public class SpringAIServiceImpl implements SpringAIService {


    public static final String WRITE_ME_HAIKU_ABOUT_CAT = """
           Write me Haiku about cat,
           haiku should start with the word cat obligatory""";
    
    private final AiClient aiClient;

    @Autowired
    public SpringAIServiceImpl(AiClient aiClient) {
        this.aiClient = aiClient;
    }
    
    @Override
    public String getCatHaiku() {
        return aiClient.generate(WRITE_ME_HAIKU_ABOUT_CAT);
    }

    @Override
    public PoetryDto getPoetryByGenreAndTheme(String genre, String theme) {
        BeanOutputParser<PoetryDto> poetryDtoBeanOutputParser = new BeanOutputParser<>(PoetryDto.class);

        String promptString = """
                Write me {genre} poetry about {theme}
                {format}
                """;

        PromptTemplate promptTemplate = new PromptTemplate(promptString);
        promptTemplate.add("genre", genre);
        promptTemplate.add("theme", theme);
        promptTemplate.add("format", poetryDtoBeanOutputParser.getFormat());

        promptTemplate.setOutputParser(poetryDtoBeanOutputParser);

        AiResponse response = aiClient.generate(promptTemplate.create());
        return poetryDtoBeanOutputParser.parse(response.getGeneration().getText());
    }
}
