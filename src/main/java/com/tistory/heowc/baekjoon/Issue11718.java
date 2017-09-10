package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue11718 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb =  new StringBuilder();

		while (scanner.hasNextLine()) {
			sb.append(scanner.nextLine() + "\n");
		}

		System.out.println(sb.toString());
	}
}
