package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;

import java.util.List;

public interface ServiceInterface {
    public void saveStudent(Student obj);
    public void saveAllStudents(List<Student> students);
    public Student findByStudentId(int id);
    public Iterable<Student> findAllByStudents();
    public Student ExistByStudentId(int id);
    public Long countStudents();
    //public Student findAllBystudentIds();

    public Iterable<Student> findAllBystudentIds(Iterable<Integer> ids);

    public void deleteStudent(Student obj);
    public void deleteBystudentId(int id);
    public void deleteAllStudents();
    public void deleteAllstudentsById(Iterable<Integer> ids);

    //void deleteAllstudentsById(Iterable<Integer> ids);

    public void deleteAllstudents(Iterable<Student> students);


}
