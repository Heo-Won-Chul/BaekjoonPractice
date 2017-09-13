package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Issue9498 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();

		System.out.print(findByScore(score));
	}

	private static Rating findByScore(final int score) {
		return Arrays.stream(Rating.values())
				.filter(rating -> score >= rating.getMinScore() && score < rating.getMaxScore())
				.findFirst()
				.get();
	}

	private enum Rating {

		A(101, 90)
		, B(90, 80)
		, C(80, 70)
		, D(70, 60)
		, F(60, 0);

		private int minScore;
		private int maxScore;

		Rating(int maxScore, int minScore) {
			this.maxScore = maxScore;
			this.minScore = minScore;
		}

		public int getMinScore() {
			return minScore;
		}

		public int getMaxScore() {
			return maxScore;
		}
	}
}
