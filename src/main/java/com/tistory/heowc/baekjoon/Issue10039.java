package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10039 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 5;
		int sum = 0;
		int tempScore;
		while (count != 0) {
			tempScore = scanner.nextInt();
			sum += (tempScore > 40 ? tempScore : 40);
			scanner.nextLine();
			count--;
		}
		System.out.print(sum/5);
	}
}
