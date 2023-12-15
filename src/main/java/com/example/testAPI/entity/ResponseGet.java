package com.example.testAPI.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResponseGet
{
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;

}
