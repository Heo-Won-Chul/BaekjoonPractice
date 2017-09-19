package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue2750 {

	public static void main(String [] args) {
		StringBuilder sb= new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();

		int [] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		for (Integer number : array) {
			sb.append(number).append("\n");
		}

		System.out.print(sb.toString());
	}
}
