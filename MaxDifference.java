package com.sudeep.arrayLogicalProgramming;

public class MaxDifference {

	public static int diff(int[] array) {
		int diff = Integer.MIN_VALUE;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				diff = Integer.max(diff, array[j] - array[i]);
			}
		}

		return diff;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 7, 3, 9, 5 };

		System.out.print("The maximum difference is " + diff(arr));
	}
}
