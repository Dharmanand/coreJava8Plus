package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;
// https://www.youtube.com/watch?v=6YIWq2JGzEQ&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=18
public class SaddlePoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[][] arr = new int[m][m];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = sc.nextInt();

		for (int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		sc.close();
		int srv = 0;
		int minVal = arr[0][0];
		for (int i = 0; i < m; i++) {

			for (int j = 1; j < m; j++) {
				if (arr[i][j] < minVal) {
					minVal = arr[i][j]; 
					srv = j;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (arr[j][srv] > arr[i][srv]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(arr[i][srv]);
				return;
			}
		}
		System.out.println("invalid saddle point");

	}

}

//		[10, 20, 30]
//		[40, 50, 60]
//		[99, 80, 70]
//output: 99

