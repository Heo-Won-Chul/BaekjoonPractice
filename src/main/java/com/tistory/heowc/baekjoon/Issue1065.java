package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1065 {

	public static void main(String [] args) {
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		int lastNumber = scanner.nextInt();

		for (int i = 1; i <= lastNumber; i++) {
			if (isHansu(i)) {
				count++;
			}
		}

		System.out.print(count);
	}

	private static boolean isHansu(int number) {
		if (number < 100) {
			return true;
		} else if (number >= 1000) {
			return false;
		}

		int oneDigistNumber = number % 10;
		number /= 10;
		int tenDigistNumber = number % 10;
		int hundredDigistNumber = number / 10;

		double tempTenDigistNumber = (oneDigistNumber + hundredDigistNumber)/2.0;
		return tempTenDigistNumber == tenDigistNumber;
	}
}
