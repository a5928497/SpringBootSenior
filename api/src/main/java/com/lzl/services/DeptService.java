package com.lzl.services;

import com.lzl.entities.Department;
import com.lzl.mappers.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public void addEmp(Department department) {
        deptMapper.addDept(department);
    }

    public void delEmp(Integer id) {
        deptMapper.delDept(id);
    }

    public void updateEmp(Department department) {
        deptMapper.updateDept(department);
    }

    public Department findById(Integer id) {
        return deptMapper.findById(id);
    }

    public List<Department> findAll() {
        return deptMapper.findAll();
    }
}
