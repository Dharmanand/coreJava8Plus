package com.kd.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByEmployeeCity {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		LoadEmployee.fetchEmployees(employees);

		System.out.println(employees);
		System.out.println();
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee :: getCity)));
		
//		Output :[Employee [id=101, name=John, city=Bangalore, salary=150000], 
//					Employee [id=102, name=Peter, city=Delhi, salary=90000], 
//					Employee [id=103, name=Kumar, city=Bangalore, salary=200000], 
//					Employee [id=104, name=Rahul, city=Chennai, salary=120000], 
//					Employee [id=105, name=Kiran, city=Chennai, salary=100000], 
//					Employee [id=106, name=Tod, city=Bangalore, salary=50000]]
//		
//					{Delhi=[Employee [id=102, name=Peter, city=Delhi, salary=90000]], 
//					 Chennai=[Employee [id=104, name=Rahul, city=Chennai, salary=120000], 
//					          Employee [id=105, name=Kiran, city=Chennai, salary=100000]], 
//							 Bangalore=[Employee [id=101, name=John, city=Bangalore, salary=150000], 
//							            Employee [id=103, name=Kumar, city=Bangalore, salary=200000], 
//							            Employee [id=106, name=Tod, city=Bangalore, salary=50000]]}

		
	}

}
