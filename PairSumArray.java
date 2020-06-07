package com.sudeep.arrayLogicalProgramming;

public class PairSumArray {

	static void pairs_value(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements and their sum : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
				}
			}
		}
	}

	public static void main(String[] args) {
		pairs_value(new int[] { 3, 6, 8, -8, 10, 8 }, 16);

	}

}
