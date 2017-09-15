package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2675 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int caseCount = scanner.nextInt();

		for (int i = 0; i < caseCount; i++) {
			int repeatCount = scanner.nextInt();
			String word = scanner.next();
			sb.append(changeRepeatWord(word, repeatCount)).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static String changeRepeatWord(String word, int repeatCount) {
		StringBuilder sb = new StringBuilder();
		for (char charAt : word.toCharArray()) {
			sb.append(repeatCharAt(charAt, repeatCount));
		}
		return sb.toString();
	}

	private static String repeatCharAt(char charAt, int repeatCount) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeatCount; i++) {
			sb.append(charAt);
		}
		return sb.toString();
	}
}
