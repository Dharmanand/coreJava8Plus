package com.kd.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUsingStream {

	public static void main(String[] args) {

		String [] inputrArr = {"Sonu", "Amit", "Manish", "Chandan", "Lokesh", "Raju"};
		//Supplier<Stream<String>> streamSupp = () -> Arrays.asList(inputrArr).stream();
		Supplier<Stream<String>> streamSupp = () -> Arrays.stream(inputrArr);
		streamSupp.get().forEach(i -> System.out.println(i)); 
		System.out.println("--------------------------------------------");
		streamSupp.get().filter(i -> i.length() > 4).forEach(i -> System.out.println(i));
		System.out.println("--------------------------------------------");
		System.out.println(streamSupp.get());
		System.out.println(streamSupp.get());
		System.out.println(streamSupp.get());
		
//		Outpot :
//			
//				Sonu
//				Amit
//				Manish
//				Chandan
//				Lokesh
//				Raju
//				--------------------------------------------
//				Manish
//				Chandan
//				Lokesh
//				--------------------------------------------
//				java.util.stream.ReferencePipeline$Head@b065c63
//				java.util.stream.ReferencePipeline$Head@768debd
//				java.util.stream.ReferencePipeline$Head@490d6c15
		
	}

}
