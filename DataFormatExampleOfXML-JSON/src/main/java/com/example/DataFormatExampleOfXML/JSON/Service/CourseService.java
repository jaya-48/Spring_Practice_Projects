package com.example.DataFormatExampleOfXML.JSON.Service;

import com.example.DataFormatExampleOfXML.JSON.Model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {
    List<Course> courses=new ArrayList<>();
    public String registerCourse(Course course){
        courses.add(course);
        return "Course Registered Successfully";
    }
    public Course getCourse(){
        Course course=new Course(1,"Java","Java is the most famous programming language",1200.0);
        return course;
    }
}
