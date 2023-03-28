package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;

//https://www.youtube.com/watch?v=5vP0-g94xEA&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=20
public class SearchInSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		System.out.print("Enter search element : ");
		int search = sc.nextInt();
		sc.close();
		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] > search) {
				break;
			} else if (arr[i][arr[0].length - 1] < search) {
				if (i == arr.length - 1) {
					break;
				}
			}
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == search) {
					System.out.println("Search Matched");
					return;
				}
			}
		}
		System.out.println("Not found");
	}
}
//Output(Not Matched) : 
//Enter search element : 11
//[10, 20, 30]
//[40, 50, 60]
//Not found

//output(Match found):
//Enter search element : 50
//[10, 20, 30]
//[40, 50, 60]
//Search Matched
