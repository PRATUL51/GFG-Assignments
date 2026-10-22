package com.java.payroll.service;

public abstract class Employee {
    private final Long empId;
    private final String name;

    public Employee(Long empId, String name){
        this.empId = empId;
        this.name = name;
    }

    // Getters and setters
    public Long getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public abstract Double calculateSalary();
}
