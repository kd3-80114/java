package com.app;
import java.util.Comparator;

public class EmployeeComparartor implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		
		int diff=Double.compare(e1.getSsn(),e2.getSsn());
		return diff;
	}
}
