package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;
//https://www.youtube.com/watch?v=SoxrXQbhCPI&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=11
public class RotateNinetyDegree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		int arr[][] = new int[m][m];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}

		sc.close();
		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));

		int arr1[][] = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				arr1[j][m - i - 1] = arr[i][j];
			}
		}
		System.out.println("------------------------------------");
		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr1[i]));

	}

}
