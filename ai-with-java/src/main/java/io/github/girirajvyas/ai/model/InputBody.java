package io.github.girirajvyas.ai.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InputBody {

    private String model;
    private String prompt;
    private float temperature;

    @JsonProperty("max_tokens")
    @SerializedName("max_tokens")
    private Long maxTokens;

}
