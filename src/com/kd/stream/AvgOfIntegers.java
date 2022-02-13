package com.kd.stream;

import java.util.Arrays;
import java.util.List;

public class AvgOfIntegers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, 11, 25, 14);
		double avg = list.stream().mapToInt(i -> i).average().getAsDouble();

		System.out.println(avg);
	}

}
