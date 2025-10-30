package com.example.RestApiCustomExceptionHandling.Service;

public class EmployeeNotFound extends RuntimeException {
    public EmployeeNotFound(String message) {
        //System.out.println(message);
        super(message);
    }
}
