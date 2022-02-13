package com.kd.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HighestLowestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 15, 56, 76, 34, 12, 15, 56, 100, 102);
		Set<Integer> set = new HashSet<>();
		Integer no = list.stream().filter(a -> set.add(a)).sorted().collect(Collectors.toList()).get(set.size() - 2);
		System.out.println(no);
		
		// another way
		
		int secNo = list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList()).get(1);
		System.out.println(secNo);
		
		//another way
		
		int secNo1 = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secNo1);
	}

}
