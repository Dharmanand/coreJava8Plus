package com.kd.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEmployee {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		LoadEmployee.fetchEmployees(employees);
		System.out.println(employees);
		
		employees.sort(Comparator.comparing(Employee::getName));
		System.out.println(employees);
		
		employees.sort(Comparator.comparing(Employee::getName).reversed());
		System.out.println("Sort in reversed order : " + employees);
		
		//Other way with steam api 
		
		employees.stream().sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getName))
		.forEach(e -> System.out.println(e.getCity() + " : " + e.getName()));
	}
}
