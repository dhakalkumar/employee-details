package com.example.employeedetails.controller;

import com.example.employeedetails.model.Employee;
import com.example.employeedetails.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeRepo employeeRepo;
    
    @Autowired
    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    
    @GetMapping("/getallemployee")
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll(); // returns the list of employee records from the database
    }
    
    @GetMapping("/employee/salary/{salary}")
    public List<Employee> getEmployees(Employee employee, @PathVariable("salary") Integer salary){
        // filter the employees whose salary is >= {salary} and save to a list
        List<Employee> list = employeeRepo.findAll()
                                          .stream()
                                          .filter(emp -> emp.getEmployeeSalary() >= salary)
                                          .collect(Collectors.toList());
        
        return list;
    }
}
