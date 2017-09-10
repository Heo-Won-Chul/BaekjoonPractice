package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Issue1000 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		if (isEmpty(input)) {
			return;
		}

		System.out.println(
				Arrays.stream(input.split(" "))
						.map(Integer::parseInt)
						.reduce(Integer::sum)
						.get()
		);
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}
}
