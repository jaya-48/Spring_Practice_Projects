package com.example.SpringBootProfiles;

import com.example.SpringBootProfiles.Service.ICourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProfilesApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringBootProfilesApplication.class, args);
        ICourse bean = container.getBean(ICourse.class);
        bean.getcoursedetails();
    }

}
