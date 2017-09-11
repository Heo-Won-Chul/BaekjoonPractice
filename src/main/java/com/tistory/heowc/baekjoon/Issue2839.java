package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2839 {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);

		int weight = scanner.nextInt();

		int five = weight / 5;
		weight %= 5;
		int three = 0;

		while(five >= 0) {
			if (weight % 3 == 0) {
				three = weight / 3;
				weight %= 3;
				break;
			} else {
				five--;
				weight += 5;
			}
		}

		System.out.println(weight == 0 ? five + three : -1);
	}
}
