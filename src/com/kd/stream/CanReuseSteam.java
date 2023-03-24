package com.kd.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CanReuseSteam {

	public static void main(String[] args) {

		String[] inputs = {"Kumar", "Rahul", "Komal", "Prince", "Patrik"};
		
		Stream<String> stream = Arrays.asList(inputs).stream();
		stream.forEach(s -> System.out.println(s));
		//stream.forEach(s -> System.out.println(s)); // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		// Then what technique will apply to reuse same stream wherever will need ?
		// Use the stream of supplier and use stream from there. As follows : 
		
		Supplier<Stream<String>> supplierStream = () -> Stream.of(inputs) ;
		supplierStream.get().forEach(s -> System.out.println(s));
		supplierStream.get().forEach(s -> System.out.println(s));
	}

}
