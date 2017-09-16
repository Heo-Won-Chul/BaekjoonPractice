package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1193 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int fountainNumber = scanner.nextInt();
		int sum = 0;
		for (int i = 1; ; i++) {
			sum += i;
			if (sum >= fountainNumber) {
				int remain = sum - fountainNumber;
				System.out.print(i % 2 == 0 ? (i - remain) + "/" + (1 + remain) : (1 + remain) + "/" + (i - remain));
				break;
			}
		}
	}
}
