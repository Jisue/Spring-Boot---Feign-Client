package com.example.demofeign.api.test.service;

import com.example.demofeign.api.test.feign.ApiClient;
import com.example.demofeign.api.test.model.response.ApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final ApiClient apiClient;
    private final ObjectMapper objectMapper;

    public ApiResponse getTestData(String userNo) {
        Map testData = apiClient.getTestData(userNo);
        ApiResponse apiResponse = objectMapper.convertValue(testData, ApiResponse.class);
        log.info("TestData: {}", apiResponse);
        return apiResponse;
    }
}
