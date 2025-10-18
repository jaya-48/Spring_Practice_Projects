package com.example.SpringBoot1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
public class Greetingclass implements Greeting{
    @Autowired
    private LocalTime time;
    @Override
    public String Greet(String name) {
        int hour = time.getHour();
        System.out.println(hour);
        if(hour<12){
            return "Good Morning" +name;
        }
        else{
            return "Good Afternoon"+name;
        }

    }
}
