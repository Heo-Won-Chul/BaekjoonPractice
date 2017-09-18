package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10250 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int caseCount = scanner.nextInt();

		for (int i = 0; i < caseCount; i++) {
			scanner.nextLine();
			sb.append(findEmptyRoom(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static String findEmptyRoom(int height, int width, int nthPerson) {
		return String.format("%d%02d", (nthPerson - 1) % height + 1, (nthPerson - 1) / height + 1);
	}
}
