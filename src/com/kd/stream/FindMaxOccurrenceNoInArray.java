package com.kd.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMaxOccurrenceNoInArray {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = { 1, 1, 1, 4, 4, 5, 5, 5, 5, 5 };
		IntStream stream = Arrays.stream(arr);

		// First way
		stream.forEach(e -> {
			if (map.get(e) == null) {
				map.put(e, 1);
			} else {
				map.put(e, map.get(e) + 1);
			}
		});
		int no = map.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
		System.out.println(no); // output : 5

		// another way
		Map<Integer, Long> map1 = Arrays.stream(arr).mapToObj(e -> e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int maxCountNo = map1.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst()
				.get().getKey();
		System.out.println(maxCountNo); // output : 5
		//------------------------------------------------
		
		int[] arr1 = { 1, 1, 1, 4, 4, 5, 5, 5, 5, 5, 9, 9, 9, 9, 9, 9, 9 };

		Entry<Integer, Long> value = Arrays.stream(arr1).mapToObj(i -> i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue())).findFirst().get();
		
		System.out.println(value); // output : 9=7
	}

}
