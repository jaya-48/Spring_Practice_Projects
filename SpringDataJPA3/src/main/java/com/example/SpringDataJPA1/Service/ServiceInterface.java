package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;

import java.util.List;

public interface ServiceInterface {
    public void saveAllStudents(List<Student> students);
    public List<Student> searchByMarksGreaterThanANDCourse(int marks, String Course);
    public List<Student> fetchByMarksBetween(int start, int end);
    public List<Student> fetchByCourse(String Course);
    public List<Student> findAllStudents();
    public int insertStudent(int id,String name,String email,String course,int marks);
    public int updateStudent(int id,String course);
    public int deleteStudent(int id);

}
