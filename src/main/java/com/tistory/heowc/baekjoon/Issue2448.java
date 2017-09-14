package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2448 {

	private static char [][] STAR_ARRAY;
	private static char STAR = '*';
	private static char BLANK = ' ';

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int lineCount = scanner.nextInt();

		STAR_ARRAY = new char[lineCount][lineCount * 2 - 1];

		int rowSize = STAR_ARRAY.length;
		int colSize = STAR_ARRAY[0].length;

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				STAR_ARRAY[i][j] = BLANK;
			}
		}

		makeStar(0, colSize / 2, lineCount);

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				sb.append(STAR_ARRAY[i][j]);
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}

	private static void makeStar(int standardRow, int standardCol, int numberK) {
		if (numberK == 3) {
			STAR_ARRAY[standardRow][standardCol] = STAR;
			STAR_ARRAY[standardRow + 1][standardCol - 1] = STAR;
			STAR_ARRAY[standardRow + 1][standardCol + 1] = STAR;
			STAR_ARRAY[standardRow + 2][standardCol - 2] = STAR;
			STAR_ARRAY[standardRow + 2][standardCol - 1] = STAR;
			STAR_ARRAY[standardRow + 2][standardCol] = STAR;
			STAR_ARRAY[standardRow + 2][standardCol + 1] = STAR;
			STAR_ARRAY[standardRow + 2][standardCol + 2] = STAR;
			return;
		}

		numberK /= 2;

		makeStar(standardRow, standardCol, numberK);
		makeStar(standardRow + numberK, standardCol - numberK, numberK);
		makeStar(standardRow + numberK, standardCol + numberK, numberK);
	}
}