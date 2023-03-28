package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;
//https://www.youtube.com/watch?v=lvRdFCMD_Ew&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=15
public class DiagonalPrint {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
//		int n = sc.nextInt();
		
		int[][] arr = new int[m][m];
		
		for(int i=0; i < m; i++)
			for(int j=0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		sc.close();
		
		for(int i=0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));
		
		for(int g=0; g<m;g++) {
			for(int i=0, j=g; j<m; i++, j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}

//		[10, 20, 30]
//		[40, 50, 60]
//		[70, 80, 90]
//output :		10
		//		50
		//		90
		//		20
		//		60
		//		30
