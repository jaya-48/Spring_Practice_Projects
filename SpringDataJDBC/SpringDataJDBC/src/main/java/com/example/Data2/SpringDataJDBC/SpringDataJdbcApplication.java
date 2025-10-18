package com.example.Data2.SpringDataJDBC;

import com.example.Data2.SpringDataJDBC.Repo.DataJdbcImp;
import com.example.Data2.SpringDataJDBC.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringDataJdbcApplication.class, args);
//        DataJdbcImp result = container.getBean(DataJdbcImp.class);
//        List<Employee> lst=result.getAllEmployees();
//        lst.forEach(e->System.out.println(e.toString()));
	}

}
