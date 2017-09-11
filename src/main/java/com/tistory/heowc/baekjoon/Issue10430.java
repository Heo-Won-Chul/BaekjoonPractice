package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Issue10430 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		if (isEmpty(input)) {
			return;
		}

		StringBuilder sb = new StringBuilder();
		List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		if (numbers != null && numbers.size() < 3) {
			return;
		}

		sb.append((numbers.get(0) + numbers.get(1)) % numbers.get(2))
			.append("\n")
			.append((numbers.get(0) % numbers.get(2) + numbers.get(1) % numbers.get(2)) % numbers.get(2))
			.append("\n")
			.append((numbers.get(0) * numbers.get(1)) % numbers.get(2))
			.append("\n")
			.append((numbers.get(0) % numbers.get(2) * numbers.get(1) % numbers.get(2)) % numbers.get(2));

		System.out.println(sb.toString());
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}
}
