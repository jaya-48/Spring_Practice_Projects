package com.example.SpringBoot1.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
@Configuration
public class Config {
    public Config(){
        System.out.println("Config bean created");
    }
    @Bean
    public LocalTime createObject(){
        return LocalTime.now();
    }
}
