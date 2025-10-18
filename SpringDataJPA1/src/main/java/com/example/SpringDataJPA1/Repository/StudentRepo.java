package com.example.SpringDataJPA1.Repository;

import com.example.SpringDataJPA1.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
}
