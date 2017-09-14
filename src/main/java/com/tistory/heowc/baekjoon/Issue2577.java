package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2577 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		int [] numbers = new int[10];

		Scanner scanner = new Scanner(System.in);

		int result = scanner.nextInt();
		scanner.nextLine();
		result *= scanner.nextInt();
		scanner.nextLine();
		result *= scanner.nextInt();

		while(result != 0) {
			numbers[result%10]++;
			result /= 10;
		}

		for (int number : numbers) {
			sb.append(number).append("\n");
		}

		System.out.print(sb.toString());
	}
}
