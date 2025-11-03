package com.example.SpringBootProfiles.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("Java")
public class Java implements ICourse{
    public Java(){
        System.out.println("java");
    }
    @Override
    public Boolean getcoursedetails() {
        System.out.println("Java Course ");
        return true;
    }
}
