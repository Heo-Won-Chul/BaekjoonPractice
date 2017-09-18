package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2775 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int caseCount = scanner.nextInt();

		for (int i = 0; i < caseCount; i++) {
			int floor = scanner.nextInt();
			int index = scanner.nextInt();
			sb.append(countPeople(floor - 1, index)).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static int countPeople(int floor, int index) {
		if (floor == 0) {
			return index * (1 + index) / 2;
		}

		int count = 0;
		for (int i = 1; i <= index; i++) {
			count += countPeople(floor - 1, i);
		}

		return count;
	}
}