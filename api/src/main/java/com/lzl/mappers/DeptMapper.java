package com.lzl.mappers;

import com.lzl.entities.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    public Department findById(Integer id);

    @Insert("INSERT INTO department(departmentName) VALUES (#{departmentName})")
    public void addDept(Department dept);

    @Delete("Delete from department WHERE id = #{id}")
    public void delDept(Integer id);

    @Update("UPDATE department SET departmentName = #{departmentName}")
    public void updateDept(Department department);

    @Select("SELECT * FROM department")
    public List<Department> findAll();
}
