package com.lzl.mappers;

import com.lzl.entities.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    public Department findById(Integer id);

    @Insert("INSERT INTO department(departmentName) VALUES (#{departmentName})")
    public void addDept(Department dept);
}
