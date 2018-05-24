package com.lzl.controllers;

import com.lzl.entities.Employee;
import com.lzl.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public List<Employee> findAll() {
        return empService.findAll();
    }
}
