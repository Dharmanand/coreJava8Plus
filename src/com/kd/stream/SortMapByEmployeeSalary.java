package com.kd.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByEmployeeSalary {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();

		Employee e1 = new Employee("kumar", 10000);
		Employee e2 = new Employee("John", 5000);
		Employee e3 = new Employee("Shalini", 20000);
		Employee e4 = new Employee("Deepak", 9000);

		map.put(e1.getName(), e1);
		map.put(e2.getName(), e2);
		map.put(e3.getName(), e3);
		map.put(e4.getName(), e4);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())))
				.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue().getSalary()));

		Map<String, Employee> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1, LinkedHashMap::new));
		System.out.println(sortedMap);

	}

}
