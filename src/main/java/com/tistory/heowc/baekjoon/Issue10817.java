package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Issue10817 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		Arrays.stream(input.split(" "))
				.map(Integer::valueOf)
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.limit(2)
				.findFirst()
				.ifPresent(System.out::print);
	}
}
