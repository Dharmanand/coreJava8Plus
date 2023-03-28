package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArrayRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int r = sc.nextInt();// r is rotation no

		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(rotateArray(arr, r)));
	}

	private static int[] rotateArray(int[] arr, int r) {

		int[] tempArr = new int[r];
		int j = 0;
		for (int i = arr.length - r; i < arr.length; i++) {
			tempArr[j++] = arr[i];
		}
		j = 0;
		for (int i = arr.length - 1 - r; i >= 0; i--) {
			arr[arr.length - 1 - j++] = arr[i];
		}
		for (int i = 0; i < r; i++) {
			arr[i] = tempArr[i];
		}
		return arr;
	}

}
