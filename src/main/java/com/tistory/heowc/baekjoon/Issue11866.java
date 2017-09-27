package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue11866 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			list.add(i + 1);
		}

		sb.append("<" + rotate(list, n - 1));
		for (int i = 1; i < m; i++) {
			sb.append(", " + rotate(list, n - 1));
		}
		System.out.print(sb.append(">"));
	}

	private static int rotate(List<Integer> list, int n) {
		for (int i = 0; i < n; i++) {
			list.add(list.remove(0));
		}
		return list.remove(0);
	}
}
