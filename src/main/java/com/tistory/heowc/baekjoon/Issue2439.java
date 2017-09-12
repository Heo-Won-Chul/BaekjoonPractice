package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Issue2439 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberN = scanner.nextInt();

		final String result = IntStream.range(0, numberN)
										.mapToObj(value -> createStar(numberN, value))
										.collect(Collectors.joining("\n"));
		System.out.print(result);
	}

	private static String createStar(final int n, final int limit) {
		return IntStream.range(0, n)
						.mapToObj(value -> n - value > limit + 1 ? " " : "*")
						.reduce((a, b) -> a + b).get();
	}
}
