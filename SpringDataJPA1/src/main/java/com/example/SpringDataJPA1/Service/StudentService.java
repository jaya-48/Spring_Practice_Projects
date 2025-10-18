package com.example.SpringDataJPA1.Service;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements ServiceInterface{
    @Autowired
    private StudentRepo srepo;
//    List<Student> students=new ArrayList<>();
//    Student obj=new Student(1,"jaya","jayapureti@gmail.com","software",45);
    @Override
    public void saveStudent(Student obj) {
        srepo.save(obj);
    }

    @Override
    public void saveAllStudents(List<Student> students) {
        srepo.saveAll(students);

    }

    @Override
    public Student findByStudentId(int id) {
        Student st1=srepo.findById(id).orElseThrow(()->new StudentNotFound("student not found") );
//        if(st1.isPresent()) {
//            return st1.get();
//        }
        return st1;
//        Optional<Student> studentOpt = srepo.findById(id);
//
//        if(studentOpt.isPresent()) {
//            return studentOpt.get();
//        } else {
//            System.out.println("Student not found");
//        }
//
//
//        return null;
    }

    @Override
    public Iterable<Student> findAllByStudents() {

        return srepo.findAll();
    }

    @Override
    public Student ExistByStudentId(int id) {

        Boolean st=srepo.existsById(id);

        if(st){
            //Student st1=srepo.findById(id);

            Student st1=srepo.findById(id).get();
            System.out.println(st1);
            return st1;
        }
        else{
            System.out.println("Student id is not there");
        }
        return null;

    }

    @Override
    public Long countStudents() {
        return srepo.count();
    }

    @Override
    public Iterable<Student> findAllBystudentIds(Iterable<Integer> ids) {
        return srepo.findAllById(ids);
    }

    @Override
    public void deleteStudent(Student obj) {
        srepo.delete(obj);
    }

    @Override
    public void deleteBystudentId(int id) {
        srepo.deleteById(id);
    }

    @Override
    public void deleteAllStudents() {
        srepo.deleteAll();
    }

    @Override
    public void deleteAllstudentsById(Iterable<Integer> ids) {
        srepo.deleteAllById(ids);
    }

    @Override
    public void deleteAllstudents(Iterable<Student> students) {
        srepo.deleteAll(students);
    }
}
