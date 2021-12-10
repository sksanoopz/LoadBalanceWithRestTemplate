package com.dailycodechallenge.employeemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String getEmployee()
    {
        return restTemplate.getForObject("http://employee-service/",String.class);
    }
}
