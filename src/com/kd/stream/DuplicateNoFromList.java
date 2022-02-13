package com.kd.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNoFromList {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(12, 15, 56, 76, 34, 12, 15, 56, 100, 102);
		Set<Integer> duplicateNoList= list.stream().filter(a -> Collections.frequency(list, a) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicateNoList);
		//another way
		Set<Integer> set = new HashSet<>();
		List<Integer> dn = list.stream().filter(a -> !set.add(a)).collect(Collectors.toList());
		System.out.println(dn);
	}

}
