package com.java.payroll.service;

public class PartTimeEmployee extends Employee{
    private final Double dailyWages;
    private final Integer days;
    public PartTimeEmployee(Long empId, String name, Double dailyWages, Integer days) {
        super(empId, name);
        this.dailyWages = dailyWages;
        this.days = days;
    }

    @Override
    public Double calculateSalary() {
        return (dailyWages * days) + 1800;
    }
}
