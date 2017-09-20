package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1929 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int numberM = scanner.nextInt();
		int numberN = scanner.nextInt();

		int [] numberArray = new int[numberN + 1];
		numberArray[1] = 1;

		for (int i = 2; i <= numberN; i++) {
			for (int j = 2; i * j <= numberN; j++) {
				numberArray[i * j] = 1;
			}
		}

		for (int i = numberM; i <= numberN; i++) {
			if (numberArray[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}