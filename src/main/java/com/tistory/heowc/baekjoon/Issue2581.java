package com.tistory.heowc.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Issue2581 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberN = scanner.nextInt();
		int numberM = scanner.nextInt();

		List<Integer> primeNumberList = new ArrayList<>();

		for (int i = numberN; i <= numberM; i++) {
			if (isPrimeNumber(i)) {
				primeNumberList.add(i);
			}
		}

		if (primeNumberList.size() > 0) {
			System.out.println(sumByPrimeNumber(primeNumberList));
			System.out.println(primeNumberList.get(0));
		} else {
			System.out.println("-1");
		}
	}

	private static boolean isPrimeNumber(int number) {
		if (number != 1) {
			for (int i = 2; i < number; i++) {
				if ((number % i) == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private static int sumByPrimeNumber(List<Integer> list) {
		int sum = 0;

		for (Integer number : list) {
			sum += number;
		}

		return sum;
	}
}