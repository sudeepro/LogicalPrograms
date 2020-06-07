package com.sudeep.arrayLogicalProgramming;

public class RemoveDuplicatesInArray {

	public static int[] removeDuplicates(int[] input) {

		int j = 0;
		int i = 1;

		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
			} else {
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}

		return output;
	}

	public static void main(String a[]) {
		int[] input1 = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int[] output = removeDuplicates(input1);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}
}
