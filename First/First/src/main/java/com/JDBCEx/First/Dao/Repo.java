package com.JDBCEx.First.Dao;

import com.JDBCEx.First.model.Employee;

import java.util.List;

public interface Repo {
    List<Employee> getAllEmployees();
}
