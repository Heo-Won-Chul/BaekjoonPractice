package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Issue14921 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");

		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(getResult(array, 0, N - 1, Integer.MAX_VALUE));
	}

	private static int getResult(int[] array, int start, int end, int min) {
		if (start == end) {
			return min;
		}

		int tempMin = array[start] + array[end];
		if (Math.abs(tempMin) < Math.abs(min)) {
			min = tempMin;
		}

		if (Math.abs(array[start]) > Math.abs(array[end])) {
			return getResult(array, start + 1, end, min);
		} else {
			return getResult(array, start, end - 1, min);
		}
	}
}
