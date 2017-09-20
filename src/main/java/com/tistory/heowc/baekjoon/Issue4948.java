package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue4948 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int maxNumber = 123456 * 2;
		int [] numberArray = new int[maxNumber + 1];
		numberArray[1] = 1;

		for (int i = 2; i <= maxNumber; i++) {
			for (int j = 2; i * j <= maxNumber; j++) {
				numberArray[i * j] = 1;
			}
		}

		while (true) {
			int input = scanner.nextInt();
			if (input == 0) {
				break;
			}

			sb.append(countPrimeNumber(numberArray, input, 2 * input)).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static int countPrimeNumber(int[] numberArray, int input, int input2) {
		int count = 0;
		for (int i = input + 1; i <= input2 ; i++) {
			if (numberArray[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
