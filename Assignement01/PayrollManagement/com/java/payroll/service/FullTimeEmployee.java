package com.java.payroll.service;

public class FullTimeEmployee extends Employee {
    private final Double basicPay;
    private final Double allowance;

    public FullTimeEmployee(Long empId, String name, Double basicPay, Double allowance) {
        super(empId, name);
        this.basicPay = basicPay;
        this.allowance = allowance;
    }

    @Override
    public Double calculateSalary() {
        return basicPay + allowance + 1800;
    }
}
