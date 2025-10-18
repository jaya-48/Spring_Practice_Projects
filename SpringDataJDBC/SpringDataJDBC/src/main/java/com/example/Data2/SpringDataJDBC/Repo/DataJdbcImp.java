package com.example.Data2.SpringDataJDBC.Repo;

import com.example.Data2.SpringDataJDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@Repository
public class DataJdbcImp {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    String sql="INSERT INTO Employee (id,name,city) VALUES(?,?,?)";
    String sql1="select * from Employee";


    public List<Employee> getAllEmployees(){
        List<Employee> result = jdbcTemplate.query(sql1,new BeanPropertyRowMapper<>(Employee.class));
        return result;
//        jdbcTemplate.update(sql,3,"jagadeesh","kerala");
    }

    }
