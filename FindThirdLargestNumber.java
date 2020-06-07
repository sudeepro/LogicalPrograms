package com.sudeep.arrayLogicalProgramming;

public class FindThirdLargestNumber {

	public static void main(String args[]) {
		int temp, size;
		int array[] = { 6, 8, 1, 9, 2, 1, 10 };
		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Third largest number is:: " + array[size - 3]);
	}
}
