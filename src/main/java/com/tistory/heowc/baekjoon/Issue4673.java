package com.tistory.heowc.baekjoon;

public class Issue4673 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		boolean [] isNotSelfNumberArray = new boolean[10036];

		for (int i = 1; i <= 10000; i++) {
			isNotSelfNumberArray[d(i)] = true;
		}

		for (int i = 1; i <= 10000; i++) {
			if (!isNotSelfNumberArray[i]) {
				sb.append(i).append("\n");
			}
		}

		System.out.print(sb.toString());
	}

	private static int d(int n) {
		int sum = n + (n % 10);
		while (n >= 10) {
			n /= 10;
			sum += n % 10;
		}
		return sum;
	}
}
