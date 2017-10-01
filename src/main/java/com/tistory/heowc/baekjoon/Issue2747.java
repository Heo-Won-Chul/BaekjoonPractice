package com.tistory.heowc.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Issue2747 {

	public static void main(String [] args) {
		int n = new Scanner(System.in).nextInt();
		BigInteger[] fibonacciArray = new BigInteger[91];

		fibonacciArray[0] = BigInteger.ZERO;
		fibonacciArray[1] = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			fibonacciArray[i] = fibonacciArray[i - 1].add(fibonacciArray[i - 2]);
		}
		System.out.print(fibonacciArray[n]);
	}
}
