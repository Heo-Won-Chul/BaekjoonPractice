package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1157 {

	private static final int ALPHABET_LENGTH = 26;
	private static int [] ALPHABET_COUNT_ARRAY = new int[ALPHABET_LENGTH];
	private static char A = 'a';

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		char [] alphabetArray = scanner.next().toLowerCase().toCharArray();

		int wordLength = alphabetArray.length;
		for (int i = 0; i < wordLength; i++) {
			ALPHABET_COUNT_ARRAY[alphabetArray[i] - A]++;
		}

		int maxAlphabetIndex = 0;
		for (int i = 0; i < ALPHABET_LENGTH; i++) {
			if (ALPHABET_COUNT_ARRAY[maxAlphabetIndex] < ALPHABET_COUNT_ARRAY[i]) {
				maxAlphabetIndex = i;
			}
		}

		int count = 0;
		for (int i = 0; i < ALPHABET_LENGTH; i++) {
			if (ALPHABET_COUNT_ARRAY[maxAlphabetIndex] == ALPHABET_COUNT_ARRAY[i]) {
				count++;
			}
		}

		System.out.print(count >= 2 ? "?" : (char)(maxAlphabetIndex + A - 32));
	}
}
