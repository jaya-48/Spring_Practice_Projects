package com.example.RestApiCustomExceptionHandling.Repository;

import com.example.RestApiCustomExceptionHandling.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
