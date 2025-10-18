package com.example.Data2.SpringDataJDBC.Repo;

import com.example.Data2.SpringDataJDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NoContainer implements CommandLineRunner {
    @Autowired
    private DataJdbcImp imp;
    @Override
    public void run(String... args) throws Exception {
        List<Employee> emps=imp.getAllEmployees();
        emps.forEach(e->System.out.println(e.toString()));
    }
}
