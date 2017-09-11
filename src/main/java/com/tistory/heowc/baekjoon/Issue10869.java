package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Issue10869 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		if (isEmpty(input)) {
			return;
		}

		List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		System.out.println(
				numbers.stream().reduce((a, b) -> a + b).get()
		);

		System.out.println(
				numbers.stream().reduce((a, b) -> a - b).get()
		);

		System.out.println(
				numbers.stream().reduce((a, b) -> a * b).get()
		);

		System.out.println(
				numbers.stream().reduce((a, b) -> a / b).get()
		);

		System.out.println(
				numbers.stream().reduce((a, b) -> a % b).get()
		);
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}
}
