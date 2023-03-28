package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;

public class ExitPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}

		sc.close();
		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));
		
		int dir = 0;

		int i = 0;
		int j = 0;

		while (true) {
			dir = (dir + arr[i][j]) % 4;

			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else if (dir == 3) {
				i--;
			}

			if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			} else if (i == arr.length) {
				i--;
				break;
			} else if (j == arr.length) {
				j--;
				break;
			}

		}
		System.out.println("Exit Point is (" + i + "," + j + ")");
	}
}
