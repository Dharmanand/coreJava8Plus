package com.kd.stream;

import java.util.Arrays;
import java.util.List;

public class SquareOfAvg {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 9, 5, 11, 25, 14);
		double sqAvg= list.stream()
						.map(a -> a*a)
						.mapToInt(a -> a)
						.average()
						.getAsDouble();
		
		System.out.println(sqAvg);
	}
}
