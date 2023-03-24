package com.kd.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByEmployeeSalary {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();

		Employee e1 = new Employee(101, "John", "Bangalore", 34, 150000);
		Employee e2 = new Employee(102, "Peter", "Delhi", 26, 90000);
		Employee e3 = new Employee(103, "Kumar", "Bangalore", 22, 200000);
		Employee e4 = new Employee(104, "Rahul", "Chennai", 30, 120000);
		Employee e5 = new Employee(105, "Kiran", "Chennai", 27, 100000);
		Employee e6 = new Employee(106, "Tod", "Bangalore", 24, 50000);

		map.put(e1.getName(), e1);
		map.put(e2.getName(), e2);
		map.put(e3.getName(), e3);
		map.put(e4.getName(), e4);
		map.put(e5.getName(), e5);
		map.put(e6.getName(), e6);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())))
				.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue().getSalary()));

		Map<String, Employee> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1, LinkedHashMap::new));
		System.out.println(sortedMap);
		
//		outpot :
//			Kumar : 200000
//			John : 150000
//			Rahul : 120000
//			Kiran : 100000
//			Peter : 90000
//			Tod : 50000
//			{Kumar=Employee [id=103, name=Kumar, city=Bangalore, age=22, salary=200000], John=Employee [id=101, name=John, city=Bangalore, age=34, salary=150000], Rahul=Employee [id=104, name=Rahul, city=Chennai, age=30, salary=120000], Kiran=Employee [id=105, name=Kiran, city=Chennai, age=27, salary=100000], Peter=Employee [id=102, name=Peter, city=Delhi, age=26, salary=90000], Tod=Employee [id=106, name=Tod, city=Bangalore, age=24, salary=50000]}


	}

}
