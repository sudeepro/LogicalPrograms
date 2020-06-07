package com.sudeep.arrayLogicalProgramming;

public class SumOfUniqueElements {

	static int minSum(int arr[], int n) {
		int sum = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {

				int j = i;
				while (j < n && arr[j] <= arr[j - 1]) {
					arr[j] = arr[j] + 1;
					j++;
				}
			}
			sum = sum + arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 2, 2, 3 };
		int n = arr.length;
		System.out.println(minSum(arr, n));
	}
}
