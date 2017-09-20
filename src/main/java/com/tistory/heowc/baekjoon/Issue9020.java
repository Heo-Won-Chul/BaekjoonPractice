package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue9020 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int maxNumber = 10000;
		int [] numberArray = new int[maxNumber + 1];
		numberArray[1] = 1;

		for (int i = 2; i <= maxNumber; i++) {
			for (int j = 2; i * j <= maxNumber; j++) {
				numberArray[i * j] = 1;
			}
		}

		int caseCount = scanner.nextInt();
		for (int i = 0; i < caseCount; i++) {
			sb.append(printPrimeNumber(numberArray, scanner.nextInt())).append("\n");
		}
		System.out.print(sb.toString());
	}

	private static String printPrimeNumber(int[] numberArray, int goldbachNumber) {
		goldbachNumber /= 2;

		int count = 0;
		while(true) {
			int minNumber = goldbachNumber - count;
			int maxNumber = goldbachNumber + count;
			if (numberArray[minNumber] == 0 && numberArray[maxNumber] == 0) {
				return minNumber + " " + maxNumber;
			}
			count++;
		}
	}
}
