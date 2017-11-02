package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10844 {

	static int[][] dp = new int[101][10];
	static final int DIVISOR = 1_000_000_000;

	public static void main(String[] args) {

		long result = 0;

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				dp[i][j] = 0;

				if (j > 0) {
					dp[i][j] += dp[i - 1][j - 1];
				}

				if (j < 9) {
					dp[i][j] += dp[i - 1][j + 1];
				}

				dp[i][j] %= DIVISOR;
			}
		}

		for (int i = 0; i <= 9; i++) {
			result += dp[N][i];
			result %= DIVISOR;
		}

		System.out.print(result);
	}
}
