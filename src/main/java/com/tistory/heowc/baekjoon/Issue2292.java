package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2292 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int roomNumber = scanner.nextInt();

		for (int i = 1; ; i++) {
			int maxRoomNumberOfLine = f(i);
			if (maxRoomNumberOfLine >= roomNumber) {
				System.out.print(i);
				break;
			}
		}
	}

	private static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return f(n - 1) + (n - 1) * 6;
		}
	}
}
