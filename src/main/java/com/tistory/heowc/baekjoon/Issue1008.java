package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Issue1008 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		if (isEmpty(input)) {
			return;
		}

		System.out.print(Arrays.stream(input.split(" "))
								.map(Double::parseDouble)
								.reduce((a, b) -> a / b)
								.get()
		);
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}
}
