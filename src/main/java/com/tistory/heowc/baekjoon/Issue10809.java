package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10809 {

	private static final int ALPHABET_LENGTH = 26;
	private static final char A = 'a';
	private static final String BLANK = " ";

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i = 0; i < ALPHABET_LENGTH; i++) {
			System.out.print(str.indexOf(A + i) + BLANK);
		}
	}
}