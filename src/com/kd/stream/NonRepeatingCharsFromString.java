package com.kd.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharsFromString {

	public static void main(String[] args) {
		String str = "dharmanand";

		Map<Character, Long> charMap = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charMap);		//{a=3, r=1, d=2, h=1, m=1, n=2}
		
		List<Character> nonrepeatingcharlist = charMap.entrySet().stream().filter(e -> e.getValue() == 1)
				.map(e -> e.getKey()).collect(Collectors.toList());
		
		System.out.println(nonrepeatingcharlist);		// final output :  [r, h, m]

	}

}
