package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Issue2438 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberN = scanner.nextInt();

		final String result = IntStream.rangeClosed(1, numberN)
										.mapToObj(Issue2438::createStar)
										.collect(Collectors.joining("\n"));
		System.out.print(result);
	}

	private static String createStar(final int limit) {
		return IntStream.rangeClosed(1, limit).mapToObj(value -> "*").reduce((a, b) -> a + b).get();
	}
}
