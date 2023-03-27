package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;
// https://www.youtube.com/watch?v=SVFXEqn3Ceo&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=7
public class SpiralDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}

		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));

		int minr = 0;
		int minc = 0;

		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		int maxCount = m * n;
		int count = 0;

		while (count < maxCount) {
			for (int i = minr; i <= maxr; i++) {
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;
			for (int i = minc; i <= maxc; i++) {
				System.out.println(arr[maxr][i]);
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr; i--) {
				System.out.println(arr[i][maxc]);
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc; i--) {
				System.out.println(arr[minr][i]);
				count++;
			}
			minr++;
		}
	}

}

//
//			[1, 2, 3, 1, 4, 56]
//			[5, 69, 25, 34, 16, 25]
//			[68, 49, 85, 35, 16, 28]
//			[27, 29, 46, 42, 51, 82]
//	output:	1
//			5
//			68
//			27
//			29
//			46
//			42
//			51
//			82
//			28
//			25
//			56
//			4
//			1
//			3
//			2
//			69
//			49
//			85
//			35
//			16
//			16
//			34
//			25

