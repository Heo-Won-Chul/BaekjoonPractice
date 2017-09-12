package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Issue8393 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberN = scanner.nextInt();
		IntStream.rangeClosed(1, numberN).reduce(Integer::sum).ifPresent(System.out::print);
	}
}
