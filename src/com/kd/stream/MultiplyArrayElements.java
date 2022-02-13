package com.kd.stream;

import java.util.Arrays;

public class MultiplyArrayElements {

	public static void main(String[] args) {

		Integer[] arr = {2, 5, 18, 45, 34};
		
		int multiply = Arrays.stream(arr).reduce((a,b) -> a*b).get();
		System.out.println(multiply);
		
	}

}
