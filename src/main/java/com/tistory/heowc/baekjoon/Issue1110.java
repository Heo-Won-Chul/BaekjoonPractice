package com.tistory.heowc.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Issue1110 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputNumber = Integer.parseInt(br.readLine());
		int compareNumber = inputNumber;
		int count = 0;

		do {
			compareNumber = changeNumber(compareNumber);
			count++;
		} while (inputNumber != compareNumber);

		System.out.print(count);
	}

	private static int changeNumber(int compareNumber) {
		int ten = 10;
		int firstNumber = compareNumber/ten;
		int secondNumber = compareNumber%ten;
		return secondNumber*ten + (firstNumber + secondNumber)%ten;
	}
}
