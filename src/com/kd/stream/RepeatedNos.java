package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedNos {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, 11, 25, 14, 11, 25, 4, 2);
		
		Map<Integer, Long> output = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(output);
		//------------
		System.out.println(list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1).collect(Collectors.toList()));//Output : [2=2, 4=2, 25=2, 11=2]
	}

}
