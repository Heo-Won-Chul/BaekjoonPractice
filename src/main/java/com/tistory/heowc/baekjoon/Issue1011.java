package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1011 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int caseCount = scanner.nextInt();

		for (int i = 0; i < caseCount; i++) {
			scanner.nextLine();
			int step = Math.abs(scanner.nextInt() - scanner.nextInt());
			sb.append(findMinRoute(step)).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static long findMinRoute(int step) {
		double sqrt = Math.sqrt(step);
		long round = Math.round(sqrt);
		if (sqrt > round) {
			return round * 2;
		} else {
			return round * 2 - 1;
		}
	}
}
