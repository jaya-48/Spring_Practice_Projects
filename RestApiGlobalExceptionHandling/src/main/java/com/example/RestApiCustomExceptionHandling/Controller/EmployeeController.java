package com.example.RestApiCustomExceptionHandling.Controller;

import com.example.RestApiCustomExceptionHandling.Model.Employee;
import com.example.RestApiCustomExceptionHandling.Repository.EmployeeRepo;
import com.example.RestApiCustomExceptionHandling.Service.EmpService;
import com.example.RestApiCustomExceptionHandling.Service.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmpService empservice;
    @Autowired
    private EmployeeRepo empRepo;

    @GetMapping("/Get/{id}")
    public ResponseEntity<String> getEmployee(@PathVariable Integer id){
            String msg=empservice.getEmployee(id);
            return  new ResponseEntity<String>(msg, HttpStatus.OK);

    }
    @GetMapping("/All")
    public ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity<>(empRepo.findAll(),HttpStatus.OK);
    }

    @PostMapping("/Post")
    public ResponseEntity<String> createEmployee(@RequestBody Employee emp){

            String msg=empservice.CreateEmp(emp);
            return  new ResponseEntity<>(msg, HttpStatus.OK);

    }
    @PutMapping("/Update1")
    public ResponseEntity<String> updateEmpl1(@RequestBody Employee emp){

            String msg=empservice.UpdateEmployee(emp);
            return  new ResponseEntity<>(msg, HttpStatus.OK);

    }
    @PatchMapping("/Update2/{id}/{salary}")
    public ResponseEntity<String> updateEmpl2(@PathVariable Integer id,@PathVariable Double salary){

            String msg=empservice.updateEmployee2(id,salary);
            return  new ResponseEntity<>(msg, HttpStatus.OK);

    }
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteEmpl(@PathVariable Integer id){

            String msg=empservice.deleteEmployee(id);
            return  new ResponseEntity<>(msg, HttpStatus.OK);

    }




}
