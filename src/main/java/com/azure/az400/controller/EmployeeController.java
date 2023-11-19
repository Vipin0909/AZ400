package com.azure.az400.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeBean emp;

    AtomicLong counter = new AtomicLong();

    @GetMapping("/welcome")
    public EmployeeBean add_Employee(@RequestParam(value="name") String name) {
        emp.setId(counter.incrementAndGet());
        emp.setContent("Welcome to Azure " + name);
        return emp;
    }
    }



