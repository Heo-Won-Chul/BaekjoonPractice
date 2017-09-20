package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1978 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int primeNumberCount = 0;
		int caseCount = scanner.nextInt();
		for (int i = 0; i < caseCount; i++) {
			if (isPrimeNumber(scanner.nextInt())) {
				primeNumberCount++;
			}
		}
		System.out.print(primeNumberCount);
	}

	private static boolean isPrimeNumber(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
