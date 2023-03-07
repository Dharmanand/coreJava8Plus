package com.kd.stream;

import java.util.Arrays;
import java.util.Optional;

public class MultiplyArrayElements {

	public static void main(String[] args) {

		Integer[] arr = { 2, 5, 18, 45, 34 };

		Optional<Integer> multiplication = Arrays.stream(arr).reduce((a, b) -> a * b);

		if (multiplication.isPresent())
			System.out.println(multiplication.get());
		// output : 275400

	}

}
