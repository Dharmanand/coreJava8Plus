package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, 11, 25, 14);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> reversedSortedList1 = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(reversedSortedList1);
		
		//another way
		List<Integer> reversedSortedList2 = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(reversedSortedList2);
	}

}
