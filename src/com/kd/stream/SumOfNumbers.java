package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, 11, 25, 14);
		Optional<Integer> sum = list.stream().reduce((a, b) -> (a + b));
		System.out.println(sum.get());
		//another way
		System.out.println(list.stream().mapToInt(a -> a).sum());
	}
}
