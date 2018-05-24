package com.lzl.mappers;

import com.lzl.entities.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface EmpMapper {

    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES (#{lastName},#{email},#{gender},#{d_id})")
    public void addEmp(Employee employee);

    @Delete("Delete from employee WHERE id = #{id}")
    public void delEmp(Integer id);

    @Update("UPDATE employee SET lastname = #{lastname},email = {email},gender = #{gender},d_id =#{d_id}")
    public void updateEmp(Employee employee);

    @Select("SELECT * FROM employee WHERE id = #{id}")
    public Employee findById(Integer id);

    @Select("SELECT * FROM employee")
    public List<Employee> findAll();
}
