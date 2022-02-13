package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNoStartWith2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, -23, 11, 25, 14);
		List<Integer> startWith2 = list.stream().map(e -> e.toString())
				.filter(i -> (i.startsWith("2") || i.startsWith("-2")))
				.map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(startWith2);
	}

}
