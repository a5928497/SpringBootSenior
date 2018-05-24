package com.lzl.controllers;

import com.lzl.entities.Department;
import com.lzl.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept")
    public List<Department> findAll() {
        return deptService.findAll();
    }

    @GetMapping("/dept/{id}")
    public Department findById(@PathVariable("id") Integer id) {
        return deptService.findById(id);
    }
}
