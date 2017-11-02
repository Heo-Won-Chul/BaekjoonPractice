package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Issue1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arraySize = Integer.parseInt(br.readLine());
		int[][] array = new int[arraySize][arraySize];

		for (int i = 0; i < arraySize; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int size = st.countTokens();
			for (int j = 0; j < size; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i < arraySize; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					array[i][j] += array[i - 1][j];
				} else if (j == i) {
					array[i][j] += array[i - 1][j - 1];
				} else {
					array[i][j] += Math.max(array[i - 1][j], array[i - 1][j - 1]);
				}
			}
		}

		int max = array[arraySize - 1][0];
		for (int i = 1; i < array[arraySize - 1].length; i++) {
			if (max < array[arraySize - 1][i]) {
				max = array[arraySize - 1][i];
			}
		}

		System.out.println(max);
	}
}
