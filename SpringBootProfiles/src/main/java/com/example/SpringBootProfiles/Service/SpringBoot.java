package com.example.SpringBootProfiles.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("sb")
public class SpringBoot implements ICourse{
    public SpringBoot(){
        System.out.println("spring");
    }
    @Override
    public Boolean getcoursedetails() {
        System.out.println("Spring boot course");
        return true;
    }
}
