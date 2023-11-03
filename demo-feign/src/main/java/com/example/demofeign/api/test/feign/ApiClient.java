package com.example.demofeign.api.test.feign;

import org.springframework.http.MediaType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "testApi", url = "https://jsonplaceholder.typicode.com", fallbackFactory = ApiClientFallbackFactory.class)
public interface ApiClient {

    @GetMapping(value = "/users/{userNo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Map getTestData(@PathVariable String userNo);
}
