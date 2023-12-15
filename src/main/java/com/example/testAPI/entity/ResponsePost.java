package com.example.testAPI.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResponsePost
{
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;
}
