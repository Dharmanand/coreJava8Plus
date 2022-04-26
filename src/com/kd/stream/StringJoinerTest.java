package com.kd.stream;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerTest {

	public static void main(String[] args) {

		String input = "Hi This is string joiner";

		// One way
		String[] inputArray = input.split(" ");
		//StringJoiner strJoiner = new StringJoiner("-"); // Output : Hi-This-is-string-joiner
		StringJoiner strJoiner = new StringJoiner("-", "[", "]"); // Output : [Hi-This-is-string-joiner]
		for (String str : inputArray) {
			strJoiner.add(str);
		}
		System.out.println(strJoiner); // Output : [Hi-This-is-string-joiner]

		// another way
		System.out.println(Stream.of(input.split(" ")).collect(Collectors.joining("-"))); // Output :
																						// Hi-This-is-string-joiner
		System.out.println(Stream.of(input.split(" ")).collect(Collectors.joining("-", "[", "]"))); // Output :
																									// [Hi-This-is-string-joiner]
	}

}
