package com.example.demofeign.api.test.controller;

import com.example.demofeign.api.test.model.response.ApiResponse;
import com.example.demofeign.api.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService testService;

    @GetMapping("/test/{userNo}")
    public ResponseEntity<ApiResponse> test(@PathVariable String userNo) {
        return ResponseEntity.ok(testService.getTestData(userNo));
    }
}
