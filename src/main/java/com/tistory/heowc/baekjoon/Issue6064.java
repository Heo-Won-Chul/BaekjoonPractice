package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue6064 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int caseCount = scanner.nextInt();

		for (int i = 0; i < caseCount; i++) {
			sb.append(indexOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())).append("\n");
		}

		System.out.print(sb.toString());
	}

	private static int indexOf(int numberM, int numberN, int numberX, int numberY) {
		int loopCount = (numberM * numberN) / findGcd(numberM, numberN) / numberM;
		for (int i = 1; i <= loopCount; i++) {
			int index = (i - 1) * numberM + numberX;
			if ((index - numberY) % numberN == 0) {
				return index;
			}
		}
		return -1;
	}

	private static int findGcd(int numberM, int numberN) {
		while (numberN != 0) {
			int temp = numberM % numberN;
			numberM = numberN;
			numberN = temp;
		}
		return numberM;
	}
}
