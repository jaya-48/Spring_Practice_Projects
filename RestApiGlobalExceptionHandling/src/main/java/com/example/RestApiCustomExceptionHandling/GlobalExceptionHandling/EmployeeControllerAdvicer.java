package com.example.RestApiCustomExceptionHandling.GlobalExceptionHandling;

import com.example.RestApiCustomExceptionHandling.Service.EmployeeNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.time.LocalDateTime;

@RestControllerAdvice
public class EmployeeControllerAdvicer {

    @ExceptionHandler(EmployeeNotFound.class)
     public ResponseEntity<ErrorDetails> handlingException(EmployeeNotFound enf){
         ErrorDetails details=new ErrorDetails("404 not foud",enf.getMessage(), LocalDateTime.now());
         return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
     }
}
