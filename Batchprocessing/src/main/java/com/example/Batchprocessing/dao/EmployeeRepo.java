package com.example.Batchprocessing.dao;

//import com.example.Batchprocessing.model.Employee;
import com.example.Batchprocessing.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails,Integer> {
}
