package com.example.DataFormatExampleOfXML.JSON.Controller;
import com.example.DataFormatExampleOfXML.JSON.Model.Course;
import com.example.DataFormatExampleOfXML.JSON.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService cservice;

    @PostMapping(value = "/post",consumes = {"application/xml","application/json"})
    public ResponseEntity<String> Register(@RequestBody  Course course){
        String msg = cservice.registerCourse(course);
        System.out.println(course);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
    @GetMapping(value = "/get",produces = {"application/xml","application/json"})
    public ResponseEntity<Course> getCourse(){
        Course course1 = cservice.getCourse();
        return new ResponseEntity<>(course1,HttpStatus.OK);
    }
}
