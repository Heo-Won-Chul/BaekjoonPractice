package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue14920 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int c = Integer.parseInt(scanner.nextLine());
		int n = 1;

		while (c != 1) {
			if (c % 2 == 0) {
				c /= 2;
			} else {
				c = 3 * c + 1;
			}
			n++;
		}
		System.out.print(n);
	}
}
