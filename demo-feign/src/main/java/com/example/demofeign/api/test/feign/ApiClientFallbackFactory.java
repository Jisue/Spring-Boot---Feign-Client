package com.example.demofeign.api.test.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class ApiClientFallbackFactory implements FallbackFactory<ApiClient> {
    @Override
    public ApiClient create(Throwable cause) {
        return new ApiClient() {
            @Override
            public Map getTestData(String userNo) {
                log.error("testData Fallback reason was: " + cause.getMessage(), cause);
                return null;
            }
        };
    }
}
