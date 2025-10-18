package com.example.SpringBoot1.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle {
    static{
        System.out.println("static block");
    }
    {
        System.out.println("Instance block");
    }
    public BeanLifeCycle(){
        System.out.println("Constructor");
    }
    @PreDestroy
    public void method1(){
        System.out.println("method1");
    }
    @PostConstruct
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
}
