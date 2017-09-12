package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Issue2742 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		final int numberN = scanner.nextInt();

		IntStream.iterate(numberN, n -> n - 1).limit(numberN).forEach(System.out::println);
	}
}
