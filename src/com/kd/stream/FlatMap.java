package com.kd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		Integer[][] array = new Integer[][] { { 2, 5 }, { 3, 4 }, { 6, 8 } };

		List<Integer[]> nos = Arrays.asList(array);
//		nos.add(Arrays.asList( 2, 5 ));
//		nos.add(Arrays.asList( 3, 4 ));
//		nos.add(Arrays.asList( 6, 8 ));
		
		System.out.println(nos);
		// array to a stream
		nos.stream().map(e -> e).forEach(System.out :: println);
		nos.stream().map(e -> Stream.of(e)).forEach(System.out :: println);
		
		// flatMap result
		nos.stream().flatMap(e -> Stream.of(e)).forEach(System.out :: println);
		
// Output : [[Ljava.lang.Integer;@15db9742, [Ljava.lang.Integer;@6d06d69c, [Ljava.lang.Integer;@7852e922]
//		[Ljava.lang.Integer;@15db9742
//		[Ljava.lang.Integer;@6d06d69c
//		[Ljava.lang.Integer;@7852e922
//		java.util.stream.ReferencePipeline$Head@4c873330
//		java.util.stream.ReferencePipeline$Head@119d7047
//		java.util.stream.ReferencePipeline$Head@776ec8df
//		2
//		5
//		3
//		4
//		6
//		8




	}

}
