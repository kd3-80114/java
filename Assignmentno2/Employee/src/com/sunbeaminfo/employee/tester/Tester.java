package com.sunbeaminfo.employee.tester;

import com.sunbeaminfo.employee.calc.Employee;

public class Tester {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.accept();
		employee.calculateYearlySalary();
		System.out.println("Salary After 10 percent raise");
		employee.setSalary(0.10*employee.getSalary()+employee.getSalary());
		employee.calculateYearlySalary();
		
		Employee employee2=new Employee();
		employee2.accept();
		employee2.calculateYearlySalary();
		System.out.println("Salary After 10 percent raise");
		employee2.setSalary(0.10*employee2.getSalary()+employee2.getSalary());
		employee2.calculateYearlySalary();
		
		

	}

}
