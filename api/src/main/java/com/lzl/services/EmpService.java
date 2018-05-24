package com.lzl.services;

import com.lzl.entities.Employee;
import com.lzl.mappers.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    public void addEmp(Employee employee) {
        empMapper.addEmp(employee);
    }

    public void delEmp(Integer id) {
        empMapper.delEmp(id);
    }

    public void updateEmp(Employee employee) {
        empMapper.updateEmp(employee);
    }

    public Employee findById(Integer id) {
        return empMapper.findById(id);
    }

    public List<Employee> findAll() {
        return empMapper.findAll();
    }
}
