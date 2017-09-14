package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Issue2920 {

	private static final String DESCENDING = "descending";
	private static final String ASCENDING = "ascending";
	private static final String MIXED = "mixed";

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scanner.nextLine());
		char [] cholesterolArray = new char[8];

		int count = 0;
		while(st.hasMoreTokens()) {
			cholesterolArray[count++] = st.nextToken().charAt(0);
		}

		if (cholesterolArray[0] > cholesterolArray[7]) {
			System.out.print(isDown(cholesterolArray) ? DESCENDING : MIXED);
		} else if (cholesterolArray[0] < cholesterolArray[7]) {
			System.out.print(isUp(cholesterolArray) ? ASCENDING : MIXED);
		} else {
			System.out.print(MIXED);
		}
	}

	private static boolean isDown(char [] cholesterolArray) {
		int length = cholesterolArray.length - 1;
		for (int i = 0; i < length; i++) {
			if (cholesterolArray[i] <= cholesterolArray[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isUp(char [] cholesterolArray) {
		int length = cholesterolArray.length - 1;
		for (int i = 0; i < length; i++) {
			if (cholesterolArray[i] >= cholesterolArray[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
