package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue11720 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		scanner.nextLine();
		String number = scanner.nextLine();

		int result = 0;

		for (int i = 0; i < count; i++) {
			result += (number.charAt(i) - '0');
		}

		System.out.print(result);
	}
}
