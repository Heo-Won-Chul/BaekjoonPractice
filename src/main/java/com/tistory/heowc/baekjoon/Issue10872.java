package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10872 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(factorial(scanner.nextInt()));
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int result = 1;
		while(n != 1) {
			result *= n;
			n--;
		}
		return result;
	}
}
