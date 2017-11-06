package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2579 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		result[0] = array[0];
		result[1] = array[0] + array[1];
		result[2] = Math.max(array[0] + array[2], array[1] + array[2]);

		for (int i = 3; i < size; i++) {
			result[i] += Math.max(result[i - 2] + array[i], result[i - 3] + array[i - 1] + array[i]);
		}

		System.out.println(result[size - 1]);
	}
}
