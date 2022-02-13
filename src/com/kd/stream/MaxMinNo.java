package com.kd.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 34, 32, 12, 45, 65, 32);
		int max = list.stream().mapToInt(e -> e).max().getAsInt();
		int min = list.stream().mapToInt(e -> e).min().getAsInt();
		System.out.println(max);
		System.out.println(min);
		
		//another way
		
		int max1 = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int min1 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	
		System.out.println(max1);
		System.out.println(min1);
	}

}
