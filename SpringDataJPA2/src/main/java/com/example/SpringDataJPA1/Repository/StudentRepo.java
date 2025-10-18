package com.example.SpringDataJPA1.Repository;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.View.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    public<T extends ResultView> List<T> findByname(String name, Class<T> cls);
}
