package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue1316 {

	public static void main(String [] args) {
		int countGroupWord = 0;

		Scanner scanner = new Scanner(System.in);
		int caseCount = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < caseCount; i++) {
			if(isGroupWord(scanner.nextLine())) {
				countGroupWord++;
			}
		}

		System.out.print(countGroupWord);
	}

	private static boolean isGroupWord(String word) {
		char [] wordArray = word.toCharArray();
		int wordLength = wordArray.length;
		for (int i = 0; i < wordLength - 1; i++) {
			int endIndex = word.lastIndexOf(wordArray[i]);
			for (int j = i + 1; j < endIndex; j++) {
				if (wordArray[i] != wordArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
