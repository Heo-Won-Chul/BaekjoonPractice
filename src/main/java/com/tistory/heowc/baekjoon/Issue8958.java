package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue8958 {

	private static char [] OXArray;
	private static char O = 'O';

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		scanner.nextLine();

		while(count != 0) {
			OXArray = scanner.nextLine().toCharArray();
			sb.append(findResult()).append("\n");
			count--;
		}

		System.out.print(sb.toString());
	}

	private static int findResult() {
		int sum = 0;
		for (int i = 0; i < OXArray.length; i++) {
			if (OXArray[i] == O) {
				sum += findSequenceSum(i);
			}
		}
		return sum;
	}

	private static int findSequenceSum(int standardIndex) {
		int sequence = 0;
		for (int i = standardIndex; i >= 0; i--) {
			if (OXArray[i] == O) {
				sequence++;
			} else {
				return sequence;
			}
		}
		return sequence;
	}
}