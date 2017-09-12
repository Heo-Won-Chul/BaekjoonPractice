package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Issue2741 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		final int numberN = scanner.nextInt();

		System.out.print(
				IntStream.iterate(1, n -> n + 1).limit(numberN).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
		);
	}
}
