package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Issue10828 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		CustomStack customStack = new CustomStack(10001);

		int executeCount = scanner.nextInt();
		for (int i = 0; i <= executeCount; i++) {
			execute(sb, customStack, scanner.nextLine());
		}
		System.out.print(sb.toString());
	}

	private static void execute(StringBuilder sb, CustomStack customStack, String contentOfLine) {
		if (contentOfLine.startsWith(Execute.PUSH.name().toLowerCase())) {
			StringTokenizer st = new StringTokenizer(contentOfLine);
			st.nextToken();
			customStack.push(Integer.parseInt(st.nextToken()));
		}

		if (Execute.POP.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(customStack.pop()).append("\n");
		}

		if (Execute.EMPTY.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(customStack.empty()).append("\n");
		}

		if (Execute.SIZE.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(customStack.size()).append("\n");
		}

		if (Execute.TOP.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(customStack.top()).append("\n");
		}
	}

	private enum Execute {
		PUSH, POP, SIZE, EMPTY, TOP
	}

	private static class CustomStack {
		private int top;
		private int[] stack;

		CustomStack(int maxSize) {
			this.top = -1;
			this.stack = new int[maxSize];
		}

		int empty() {
			return top == -1 ? 1 : 0;
		}

		void push(int data) {
			stack[++top] = data;
		}

		int top() {
			return top == -1 ? -1 : stack[top];
		}

		int pop() {
			return top == -1 ? -1 : stack[top--];
		}

		int size() {
			return top + 1;
		}
	}
}