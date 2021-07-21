package com.example.employeedetails.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name")
    private String employeeName;
    
    @Column(name = "salary")
    private Integer employeeSalary;
    
    public Employee() {}
    
    public Employee(Integer id, String employeeName, Integer employeeSalary) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public Integer getEmployeeSalary() {
        return employeeSalary;
    }
    
    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
