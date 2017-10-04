package com.tistory.heowc.baekjoon;

import java.util.Scanner;

/*
	이항계수 (n C r)
	n C r = n-1 C r-1 + n-1 C r
*/
public class Issue11050 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.print(choose(n, k));
	}

	private static int choose(int n, int r) {
		if (n == r || r == 0) {
			return 1;
		}

		return choose(n - 1, r - 1) + choose(n - 1, r);
	}
}
