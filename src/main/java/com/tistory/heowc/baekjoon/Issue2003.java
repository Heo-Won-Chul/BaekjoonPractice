package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.*;

public class Issue2003 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer firstSt = new StringTokenizer(br.readLine());
		StringTokenizer secondSt = new StringTokenizer(br.readLine());

		final int LIMIT = 10000;
		int N = Integer.parseInt(firstSt.nextToken());
		int M = Integer.parseInt(firstSt.nextToken());

		int [] array = new int[LIMIT];
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(secondSt.nextToken());
			array[i] = number;
		}

		int count = 0;
		int s = 0;
		int e = 0;
		int sum = 0;
		while(true) {
			if (N == s) {
				break;
			}

			if (sum >= M) {
				sum -= array[e];
				e++;
			} else {
				sum += array[s];
				s++;
			}

			if (sum == M) {
				count++;
			}
		}

		System.out.print(count);
	}
}
