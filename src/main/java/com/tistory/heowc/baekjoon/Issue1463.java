package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1463 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		int [] array = new int[1000001];
		array[1] = 0;
		for (int i = 2; i <= input; i++) {
			array[i] = array[i - 1] + 1;

			if (i % 2 == 0) {
				array[i] = min(array[i], array[i / 2] + 1);
			}

			if (i % 3 == 0) {
				array[i] = min(array[i], array[i / 3] + 1);
			}
		}

		System.out.print(array[input]);
	}

	private static int min(int n, int m) {
		return n > m ? m : n;
	}
}
