package com.example.SpringDataJPA1;

import com.example.SpringDataJPA1.Entity.Student;
import com.example.SpringDataJPA1.Service.StudentNotFound;
import com.example.SpringDataJPA1.Service.StudentService;
import com.example.SpringDataJPA1.View.Resultview1;
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
        Student s4=new Student(1,"jaya","jayapureti@gmail.com","Btech",86);
        Student s5=new Student(2,"lakshmi","luckypureti@gmail.com","Btech",89);
        Student s6=new Student(3,"jaggu","jaggugandham@gmail.com","Btech",96);
        Student s7=new Student(4,"jaya","pureti470@gmail.com","BTECH",86);
        students2.add(s4);
        students2.add(s5);
        students2.add(s6);
        students2.add(s7);
        List<Integer> newids=new ArrayList<>();
        newids.add(1);
        newids.add(2);

        //service.saveStudent(s1);
       //service.saveAllStudents(students2);
       //service.deleteAllStudents(students2);
//       service.saveAllStudents(students1);
       //service.deleteAllbyIdStudents(newids);
 //      service.deleteAllStudents();
//        System.out.println(service.findByname("jaya").getCourse());
//        System.out.println(service.findByname("jaya").getName());
//        System.out.println(service.findByname("jaya").getMarks());
        service.findBynames("jaya", Resultview1.class).forEach(v->System.out.println(v.getCourse()));




    }

}
