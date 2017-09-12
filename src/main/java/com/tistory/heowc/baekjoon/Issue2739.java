package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Issue2739 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberN = scanner.nextInt();

		IntStream.iterate(1, n -> n + 1).limit(9).mapToObj(value -> String.format("%d * %d = %d", numberN, value, numberN * value)).forEach(System.out::println);
	}
}
