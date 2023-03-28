package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;
//https://www.youtube.com/watch?v=_olQ9Rrnm_c&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=5
public class WaveTraversal {

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

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < m; j++)
					System.out.println(arr[j][i]);
			else
				for (int j = m-1; j >= 0; j--)
					System.out.println(arr[j][i]);
		}

	}

}
