package com.java.payroll;

import com.java.payroll.service.Employee;
import com.java.payroll.service.FullTimeEmployee;
import com.java.payroll.service.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Payroll Management System");

        Employee emp01 = new PartTimeEmployee(1L, "Prasad",750.0,17);
        System.out.println("Salary for empId " +emp01.getEmpId()+ ": " +  emp01.calculateSalary());

        Employee emp02 = new FullTimeEmployee(2L,"Pratul", 15500.0,9500.0);
        System.out.println("Salary for empId " +emp02.getEmpId()+ ": " +  emp02.calculateSalary());
    }
}
