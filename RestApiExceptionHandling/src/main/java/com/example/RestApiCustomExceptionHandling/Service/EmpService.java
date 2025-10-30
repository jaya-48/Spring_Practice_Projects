package com.example.RestApiCustomExceptionHandling.Service;

import com.example.RestApiCustomExceptionHandling.Model.Employee;
import com.example.RestApiCustomExceptionHandling.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmployeeRepo erepo;

    public String CreateEmp(Employee emp){
        erepo.save(emp);
        Optional<Employee> emp1 = erepo.findById(emp.getEmpid());
        if(emp1.isPresent()){
            return "Employee created Successfully";
        }
        else {
            throw new EmployeeNotFound("Employee creation failed");
        }
    }
    public String UpdateEmployee(Employee emp){
        //Employee emp2 = erepo.save(emp);
        Optional<Employee> emp3=erepo.findById(emp.getEmpid());
        if(emp3.isPresent()){
            erepo.save(emp);
            return "Employee Updated Successfully";
        }
        else {
            throw new EmployeeNotFound("Employee filed updation failed");
        }
    }
    public String updateEmployee2(Integer id,Double salary){
        Optional<Employee> Emp1 = erepo.findById(id);
        if(Emp1.isPresent()){
            Emp1.get().setSalary(salary);
            erepo.save(Emp1.get());
            return "Employee updated with salary "+Emp1.get().getSalary();
        }
        else{
            throw new EmployeeNotFound("Employee not updated with this id"+id);
        }
    }
    public String getEmployee(Integer id){
        Optional<Employee> Emp1 = erepo.findById(id);
        if(Emp1.isPresent()){
            Employee emp2=erepo.findById(id).get();
            return "Employee fetched with name "+emp2.getEmpname();
        }
        else{
            throw new EmployeeNotFound("Employee not found with this id"+id);
        }
    }
    public String deleteEmployee(Integer id){
        Optional<Employee> Emp1 = erepo.findById(id);
        if(Emp1.isPresent()){
            erepo.deleteById(id);
            return "Employee fetched with id "+Emp1.get().getEmpid();
        }
        else{
            throw new EmployeeNotFound("Employee not found with this id"+id);
        }
    }

}
