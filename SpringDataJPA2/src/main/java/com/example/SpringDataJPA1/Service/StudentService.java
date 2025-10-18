package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.Repository.StudentRepo;
import com.example.SpringDataJPA1.View.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements ServiceInterface{
    @Autowired
    private StudentRepo srepo;

    @Override
    public void saveStudent(Student s) {
        Student student = srepo.save(s);
        if(student.getId() !=null){
            System.out.println("Student record saved Successfully!");
        }
        else{
            System.out.println("Student Record not saved Successfully");
        }
    }

    @Override
    public void saveAllStudents(List<Student> students) {
        srepo.saveAllAndFlush(students);

    }

    @Override
    public void deleteAllbyIdStudents(List<Integer> ids) {
        srepo.deleteAllByIdInBatch(ids);

    }

    @Override
    public void deleteAllStudents() {
          srepo.deleteAllInBatch();
    }

    @Override
    public void deleteAllStudents(List<Student> students) {
          srepo.deleteAllInBatch(students);
    }

    @Override
    public <T extends ResultView> List<T> findBynames(String name, Class<T> cls) {
        return srepo.findByname(name,cls);
    }


}
