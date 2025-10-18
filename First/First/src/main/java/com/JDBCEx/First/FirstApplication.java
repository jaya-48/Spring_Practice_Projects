package com.JDBCEx.First;

import com.JDBCEx.First.Dao.Company;
import com.JDBCEx.First.Dao.RepoImp;
import com.JDBCEx.First.model.Employee;
import com.JDBCEx.First.model.Employee2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(FirstApplication.class, args);
        //RepoImp details = container.getBean(RepoImp.class);
        //System.out.println(details.toString());
        //List<Employee> employees = details.getAllEmployees();
        //System.out.println(employees.toString());
       // employees.forEach(e->System.out.println(e.toString()));
        Company company = container.getBean(Company.class);
        List<Employee2> employee3=company.getAllBossEmployee();
        employee3.forEach(e->System.out.println(e.toString()));
	}

}
