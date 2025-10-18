package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements ServiceInterface {
    @Autowired
    private StudentRepo srepo;

    @Override
    public void saveAllStudents(List<Student> students) {
        srepo.saveAll(students);

    }

    @Override
    public List<Student> searchByMarksGreaterThanANDCourse(int marks, String Course) {
        return srepo.findByMarksGreaterThanAndCourse(marks, Course);
    }

    @Override
    public List<Student> fetchByMarksBetween(int start, int end) {
        return srepo.findByMarksBetween(start, end);
    }

    @Override
    public List<Student> fetchByCourse(String Course) {
        return srepo.findByCourse(Course);
    }

    @Override
    public List<Student> findAllStudents() {
        return srepo.searchAllStudents();
    }

    @Override
    public int insertStudent(int id, String name, String email, String course, int marks) {
        return srepo.insertStudent(id,name,email,course,marks);
    }

    @Override
    public int updateStudent(int id, String course) {
        return srepo.updateStudent(id,course);
    }

    @Override
    public int deleteStudent(int id) {
        return srepo.deleteStudent(id);
    }

}
