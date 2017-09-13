package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Issue10871 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		final int numberN = scanner.nextInt();
		final int numberX = scanner.nextInt();
		scanner.nextLine();
		String numberContent = scanner.nextLine();

		String result = Arrays.stream(numberContent.split(" "))
								.map(Integer::valueOf)
								.filter(number -> number < numberX)
								.map(String::valueOf)
								.collect(Collectors.joining(" "));

		System.out.print(result);
	}
}
