package com.example.testAPI.controller;

import com.example.testAPI.service.TestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestAPIController {

    private final TestAPIService testAPIService;

    @Autowired
    public TestAPIController(TestAPIService testAPIService) {
        this.testAPIService = testAPIService;
    }

    @GetMapping("/getapi")
    public ResponseEntity<Object> getApi() {
        return ResponseEntity.ok(testAPIService.getApi());
    }
    @GetMapping("/getapilist")
    public ResponseEntity<Object> getapilist() {
        return ResponseEntity.ok(testAPIService.getapilist());
    }

    @PostMapping("/postapi")
    public ResponseEntity<Object> postApi(@RequestBody String requestBody) {
        return ResponseEntity.ok(testAPIService.postApi(requestBody));
    }
}
