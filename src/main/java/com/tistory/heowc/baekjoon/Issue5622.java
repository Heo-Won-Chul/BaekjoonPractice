package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue5622 {

	private static final int DEFAULT_SECOND = 3;

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (char alphabet : scanner.next().toCharArray()) {
			sum += findTime(alphabet);
		}
		System.out.print(sum);
	}

	private static int findTime(char alphabet) {
		switch (alphabet) {
			case 'A': case 'B': case 'C':
				return DEFAULT_SECOND;
			case 'D': case 'E': case 'F':
				return DEFAULT_SECOND + 1;
			case 'G': case 'H': case 'I':
				return DEFAULT_SECOND + 2;
			case 'J': case 'K': case 'L':
				return DEFAULT_SECOND + 3;
			case 'M': case 'N': case 'O':
				return DEFAULT_SECOND + 4;
			case 'P': case 'Q': case 'R': case 'S':
				return DEFAULT_SECOND + 5;
			case 'T': case 'U': case 'V':
				return DEFAULT_SECOND + 6;
			case 'W': case 'X': case 'Y': case 'Z':
				return DEFAULT_SECOND + 7;
			default:
				return 0;
		}
	}
}
