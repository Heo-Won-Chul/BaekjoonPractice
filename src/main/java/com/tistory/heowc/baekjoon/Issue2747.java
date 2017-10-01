package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue2747 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] fibonacciArray = new int[n + 1];

		fibonacciArray[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
		}
		System.out.print(fibonacciArray[n]);
	}
}
