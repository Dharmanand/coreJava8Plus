package com.kd.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsFromString {

	public static void main(String[] args) {

		String prargraph = "Kumar AAA Kumar AAA bbb";
		List<String> stList = Arrays.asList(prargraph.split(" "));
		System.out.println(stList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		System.out.println(stList.stream().filter(a -> Collections.frequency(stList, a) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// output :
		// 			{AAA=2, bbb=1, Kumar=2}
		// 			{AAA=2, Kumar=2}

	}

}
