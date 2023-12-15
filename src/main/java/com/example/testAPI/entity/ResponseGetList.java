package com.example.testAPI.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Getter
@Data
public class ResponseGetList {
    @JsonProperty("responseGets")
    private List<ResponseGet> responseGets;
    public List<ResponseGet> getResponseGets() {
        return responseGets;
    }
    public void setResponseGets(List<ResponseGet> responseGets) {
        this.responseGets = responseGets;
    }
}
