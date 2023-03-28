package com.kd.ds.array.twoD;

import java.util.Arrays;
import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int s = sc.nextInt();
		int r = sc.nextInt();

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));
		
		int[] arr1 = copyDataFromArrToOneDArr(arr, s);
		System.out.println("copyDataFromArrToOneDArr : " + Arrays.toString(arr1));
		arr1 = rotateArray(arr1, r);
		arr = copyOneDArrToDataFromArr(arr, arr1, s);
		System.out.println("copyOneDArrToDataFromArr : ");
		for (int i = 0; i < m; i++)
			System.out.println(Arrays.toString(arr[i]));
	}

	private static int[][] copyOneDArrToDataFromArr(int[][] arr, int[] arr1, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;

		int j = 0;
		for (int i = minr; i <= maxr; i++) {
			arr[i][minc] = arr1[j++];
		}
		minc++;
		for (int i = minc; i <= maxc; i++) {
			arr[maxr][i] = arr1[j++];
		}
		maxr--;
		for (int i = maxr; i >= minr; i--) {
			arr[i][maxc] = arr1[j++];
		}
		maxc--;
		for (int i = maxc; i >= minc; i--) {
			arr[minr][i] = arr1[j++];
		}
		return arr;
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

	private static int[] copyDataFromArrToOneDArr(int[][] arr, int s) {

		int length = (arr.length - s)* 2 + 2 * (arr[0].length - s) - 4;

		int[] arr1 = new int[length];

		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;

		int j = 0;
		for (int i = minr; i <= maxr; i++) {
			arr1[j++] = arr[i][minc];
		}
		minc++;
		for (int i = minc; i <= maxc; i++) {
			arr1[j++] = arr[maxr][i];
		}
		maxr--;
		for (int i = maxr; i >= minr; i--) {
			arr1[j++] = arr[i][maxc];
		}
		maxc--;
		for (int i = maxc; i >= minc; i--) {
			arr1[j++] = arr[minr][i];
		}
		return arr1;
	}

}
