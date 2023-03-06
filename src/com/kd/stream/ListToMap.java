package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 5, 10);
		System.out.println(list.stream().collect(Collectors.toMap(i -> i, i -> i * 3)));

		//Output : {2=6, 5=15, 10=30}
	}

}
