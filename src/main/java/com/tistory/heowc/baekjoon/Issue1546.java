package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Issue1546 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();
		String scoreContent = scanner.nextLine();

		final String[] scoreArray = scoreContent.split(" ");

		Arrays.stream(scoreArray)
				.mapToDouble(Double::valueOf)
				.max()
				.ifPresent(maxScore -> {
					final OptionalDouble optionalAverage = findAverage(scoreArray, maxScore);
					optionalAverage.ifPresent(average -> System.out.printf("%.2f", average));
				});
	}

	private static OptionalDouble findAverage(final String [] scoreArray, final double maxScore) {
		return Arrays.stream(scoreArray)
				.mapToDouble(Double::valueOf)
				.map(score -> score/maxScore*100)
				.average();
	}
}
