package com.kd.stream;

import java.util.List;

public class LoadEmployee {

	public static List<Employee> fetchEmployees(List<Employee> employees) {

		Employee e1 = new Employee(101, "John", "Bangalore", 34, 150000);
		Employee e2 = new Employee(102, "Peter", "Delhi", 26, 90000);
		Employee e3 = new Employee(103, "Kumar", "Bangalore", 22, 200000);
		Employee e4 = new Employee(104, "Rahul", "Chennai", 30, 120000);
		Employee e5 = new Employee(105, "Kiran", "Chennai", 27, 100000);
		Employee e6 = new Employee(106, "Tod", "Bangalore", 24, 50000);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		return employees;
	}
	
}
