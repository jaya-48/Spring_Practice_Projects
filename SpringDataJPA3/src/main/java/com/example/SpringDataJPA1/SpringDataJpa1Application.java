package com.example.SpringDataJPA1;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.Service.StudentNotFound;
import com.example.SpringDataJPA1.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
        StudentService service = context.getBean(StudentService.class);
        List<Student>students1=new ArrayList<>();
        Student s1=new Student(1,"jaya","jayapureti@gmail.com","Btech",86);
        Student s2=new Student(2,"lakshmi","luckypureti@gmail.com","Btech",89);
        Student s3=new Student(3,"jaggu","jaggugandham@gmail.com","Btech",96);
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        List<Student> students2 =new ArrayList<>();
        Student s4=new Student(4,"rajini","rajini@gmail.com","Btech",87);
        Student s5=new Student(5,"kusuma","kusuma@gmail.com","Btech",89);
        Student s6=new Student(6,"nivi","nivi@gmail.com","Btech",90);
        students2.add(s4);
        students2.add(s5);
        students2.add(s6);
        List<Integer> newids=new ArrayList<>();
        newids.add(1);
        newids.add(2);
        Student s7=new Student(7,"manikanta","manikanta@gmail.com","Btech",92);
        //newids.add(3);
       // try {
//            service.saveStudent(s1);
//            service.ExistByStudentId(4);
//            service.findByStudentId(2);
//            service.findByStudentId(6);
            //service.saveAllStudents(students1);
//            service.ExistByStudentId(2);
            //service.findByStudentId(2);
         //System.out.println(service.findAllByStudents());
           // System.out.println(service.countStudents());
           //System.out.println(service.findAllBystudentIds(newids));
           //service.deleteBystudentId(3);
//service.deleteAllStudents();
            //service.saveAllStudents(students2);
            //service.deleteStudent(s6);
        //service.deleteAllstudents(students2);
//        }
//        catch (StudentNotFound e) {
//            //throw new RuntimeException(e);
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e1) {
//            //throw new RuntimeException(e);
//            System.out.println(e1.getMessage());
//        }
        //service.searchByMarksGreaterThanANDCourse(87,"Btech").forEach(v->System.out.println(v));
        //service.fetchByMarksBetween(80,98).forEach(v->System.out.println(v));
        //service.fetchByCourse("BTECH").forEach(v->System.out.println(v));
        //service.findAllStudents().forEach(v->System.out.println(v));
        //service.insertStudent(7,"manikanta","mani@gmail.com","Btech",92);
        //service.updateStudent(4,"Degree");
        service.deleteStudent(2);
    }

}
