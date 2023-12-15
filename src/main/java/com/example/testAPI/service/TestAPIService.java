package com.example.testAPI.service;

import com.example.testAPI.entity.ResponseGet;
import com.example.testAPI.entity.ResponseGetList;
import com.example.testAPI.entity.ResponsePost;


public interface TestAPIService {
    ResponseGet getApi();
    ResponseGetList getapilist();
    ResponsePost postApi(String requestBody);
}
