package com.kd.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharInString {

	public static void main(String[] args) {

		String str = "dharmanand";
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i < str.length(); i++) {
			if(map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
		}
		System.out.println(map);
		System.out.println(str.codePoints().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1))));

	}
	
}
