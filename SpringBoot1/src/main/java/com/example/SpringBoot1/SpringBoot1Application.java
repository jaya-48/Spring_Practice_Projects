package com.example.SpringBoot1;

import com.example.SpringBoot1.Service.BeanLifeCycle;
import com.example.SpringBoot1.Service.Greetingclass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
        System.out.println("Hello People");
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
        //System.out.println("Hello People");
//        Greetingclass first = context.getBean(Greetingclass.class);
//        String wish=first.Greet("jaya");
//        System.out.println(wish);
        BeanLifeCycle life1 = context.getBean(BeanLifeCycle.class);
        life1.method3();
        context.close();

	}

}
