package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Issue2739 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberN = scanner.nextInt();

		final String result = IntStream.iterate(1, n -> n + 1)
										.limit(9)
										.mapToObj(value -> String.format("%d * %d = %d", numberN, value, numberN * value))
										.collect(Collectors.joining("\n"));
		System.out.print(result);
	}
}
