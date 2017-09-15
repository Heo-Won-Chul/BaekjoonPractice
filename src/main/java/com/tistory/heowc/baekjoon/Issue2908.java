package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2908 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();

		System.out.print(Math.max(firstNumber%10*100 + firstNumber/10%10*10 + firstNumber/100, secondNumber%10*100 + secondNumber/10%10*10 + secondNumber/100));
	}
}
