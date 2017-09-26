package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1003 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int caseCount = scanner.nextInt();

		int [][] array = new int [41][2];

		array[0] = new int[] {1, 0};
		array[1] = new int[] {0, 1};
		for (int i = 2; i < 41 ; i++) {
			array[i][0] = array[i-1][1];
			array[i][1] = array[i-1][0] + array[i-1][1];
		}

		for (int i = 0; i < caseCount; i++) {
			int index = scanner.nextInt();
			sb.append(array[index][0] + " " + array[index][1] + "\n");
		}

		System.out.print(sb);
	}
}