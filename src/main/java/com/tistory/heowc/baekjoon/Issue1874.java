package com.tistory.heowc.baekjoon;

import java.io.*;

public class Issue1874 {

	public static void main(String [] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberLength = Integer.parseInt(br.readLine());
		int [] array = new int[numberLength];

		int index = 0;
		int maxNumber = 0;
		for (int i = 0; i < numberLength; i++) {
			int number =  Integer.parseInt(br.readLine());

			if (number > maxNumber) {
				for (int j = maxNumber; j < number; j++) {
					array[index++] = j + 1;
					sb.append("+\n");
				}
			} else {
				if (array[index - 1] != number) {
					System.out.print("NO");
					return;
				}
			}

			index--;
			sb.append("-\n");

			if (number > maxNumber) {
				maxNumber = number;
			}
		}

		System.out.println(sb.toString());
	}
}
