package com.tistory.heowc.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Issue1924 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		final int month = scanner.nextInt();
		final int day = scanner.nextInt();

		final int sum = Arrays.stream(LastDayOfMonth.values())
								.limit(month - 1)
								.map(LastDayOfMonth::getLastDay)
								.reduce(Integer::sum)
								.orElse(0);

		printDayOfWeek((sum + day) % 7);
	}

	private static void printDayOfWeek(int remain) {
		switch (remain) {
			case 0: System.out.print("SUN"); break;
			case 1: System.out.print("MON"); break;
			case 2: System.out.print("TUE"); break;
			case 3: System.out.print("WED"); break;
			case 4: System.out.print("THU"); break;
			case 5: System.out.print("FRI"); break;
			case 6: System.out.print("SAT"); break;
			default: System.out.print("Unknown"); break;
		}
	}

	private enum LastDayOfMonth {
		JAN(31), FEB(28), MAR(31), APR(30)
		, May(31), Jun(30), Jul(31), Aug(31)
		, Sep(30), Oct(31), Nov(30), Dec(31);

		private int lastDay;

		LastDayOfMonth(int lastDay) {
			this.lastDay = lastDay;
		}

		public int getLastDay() {
			return lastDay;
		}
	}
}
