package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue11721 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int inputLength = input.length();
		int count = (int) Math.ceil(inputLength / 10.0);

		for (int i = 0; i < count; i++) {
			int startIndex = i * 10;
			int endIndex = (i + 1) * 10;
			if (endIndex > inputLength) {
				sb.append(input.substring(startIndex, inputLength)).append("\n");
			} else {
				sb.append(input.substring(startIndex, endIndex)).append("\n");
			}
		}

		System.out.print(sb.toString());
	}
}
