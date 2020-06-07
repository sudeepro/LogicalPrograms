package com.sudeep.arrayLogicalProgramming;

public class MaxAndMinArray {
	static int max;
	static int min;

	public static void max_min(int arr[]) {
		max = arr[0];
		min = arr[0];
		int len = arr.length;
		for (int i = 1; i < len - 1; i = i + 2) {
			if (i + 1 > len) {
				if (arr[i] > max)
					max = arr[i];
				if (arr[i] < min)
					min = arr[i];
			}
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > max)
					max = arr[i];
				if (arr[i + 1] < min)
					min = arr[i + 1];
			}
			if (arr[i] < arr[i + 1]) {
				if (arr[i] < min)
					min = arr[i];
				if (arr[i + 1] > max)
					max = arr[i + 1];
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		max_min(array);

		System.out.println(" Maximum value for the above array = " + max);
		System.out.println(" Minimum value for the above array = " + min);
	}

}
