package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.View.ResultView;

import java.util.List;

public interface ServiceInterface {
       public void saveStudent(Student s);
       public void saveAllStudents(List<Student> students);
       public void deleteAllbyIdStudents(List<Integer> ids);
       public void deleteAllStudents();
       public void deleteAllStudents(List<Student>students);
    public<T extends ResultView> List<T> findBynames(String name, Class<T> cls);
       //public void deleteStudent(Student s);

}
