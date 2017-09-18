package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1475 {

	public static void main(String [] args) {
		double [] countArray = new double[10];
		Scanner scanner = new Scanner(System.in);

		char [] roomNumberArray = scanner.next().toCharArray();

		for (char roomNumber : roomNumberArray) {
			countArray[roomNumber - '0']++;
		}

		countArray[6] = (countArray[6] + countArray[9])/2.0;
		countArray[9] = 0;

		int maxIndex = 0;
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] >= countArray[maxIndex]) {
				maxIndex = i;
			}
		}

		System.out.print((int)Math.ceil(countArray[maxIndex]));
	}
}
