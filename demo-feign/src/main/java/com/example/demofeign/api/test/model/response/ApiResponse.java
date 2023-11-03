package com.example.demofeign.api.test.model.response;

import com.example.demofeign.api.test.model.Address;
import com.example.demofeign.api.test.model.Company;
import lombok.Data;

@Data
public class ApiResponse {
    private String id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
