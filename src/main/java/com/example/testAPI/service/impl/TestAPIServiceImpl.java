package com.example.testAPI.service.impl;

import com.example.testAPI.entity.ResponseGet;
import com.example.testAPI.entity.ResponseGetList;
import com.example.testAPI.entity.ResponsePost;
import com.example.testAPI.service.TestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TestAPIServiceImpl implements TestAPIService {

    @Autowired
    private RestTemplate restTemplate;

    public TestAPIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override  // Get
    public ResponseGet getApi() {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<ResponseGet> responseEntity = restTemplate.getForEntity(apiUrl, ResponseGet.class);
        return responseEntity.getBody();
    }

    @Override  // Post
    public ResponsePost postApi(String requestBody) {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json;charset=utf-8");
        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<ResponsePost> responseEntity = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                requestEntity,
                ResponsePost.class
        );
        return responseEntity.getBody();

    }
    @Override  // GetList
    public ResponseGetList getapilist(){
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<ResponseGet[]> responseEntity = restTemplate.getForEntity(apiUrl, ResponseGet[].class);
        ResponseGet[] responseGetsArray = responseEntity.getBody();
        assert responseGetsArray != null;
        List<ResponseGet> responseGets = Arrays.asList(responseGetsArray);
        ResponseGetList responseGetList = new ResponseGetList();
        responseGetList.setResponseGets(responseGets);
        System.out.println("apiResult: " + responseGetList.getResponseGets());
        return responseGetList;
    }

}