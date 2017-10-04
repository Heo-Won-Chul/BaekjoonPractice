package com.tistory.heowc.baekjoon;

import java.util.Scanner;

// 파스칼의 삼각형 응용
public class Issue11051 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int [][] array = new int[1001][1001];
		array[0][0] = 1;
		array[1][0] = 1;
		array[1][1] = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == n || j == 0) {
					array[i][j] = 1;
				} else {
					array[i][j] = (array[i - 1][j - 1] + array[i - 1][j]) % 10007 ;
				}

				if (i == n && j == k) {
					break;
				}
			}
		}

		System.out.print(array[n][k]);
	}
}
