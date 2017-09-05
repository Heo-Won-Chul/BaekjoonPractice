package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue10828 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		CustomStack customStack = new CustomStack(10001);
		int executeCount = scanner.nextInt();

		for (int i = 0; i <= executeCount; i++) {
			String contentOfLine = scanner.nextLine();
			execute(contentOfLine, customStack);
		}
	}

	private static void execute(String contentOfLine, CustomStack customStack) {
		if (isEmpty(contentOfLine)) {
			return;
		}

		if (contentOfLine.startsWith(Execute.PUSH.name().toLowerCase())) {
			customStack.push(Integer.parseInt(contentOfLine.split(" ")[1]));
		}

		if (Execute.POP.name().equalsIgnoreCase(contentOfLine)) {
			System.out.println(customStack.pop());
		}

		if (Execute.EMPTY.name().equalsIgnoreCase(contentOfLine)) {
			System.out.println(customStack.empty());
		}

		if (Execute.SIZE.name().equalsIgnoreCase(contentOfLine)) {
			System.out.println(customStack.size());
		}

		if (Execute.TOP.name().equalsIgnoreCase(contentOfLine)) {
			System.out.println(customStack.top());
		}
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}

	private enum Execute {
		PUSH, POP, SIZE, EMPTY, TOP
	}

	static class CustomStack {
		private int top;
		private int maxSize;
		private int[] stack;

		public CustomStack(int maxSize){
			this.top = -1;
			this.maxSize = maxSize;
			this.stack = new int[maxSize];
		}

		public int empty(){
			if(top == -1){
				return 1;
			}
			return 0;
		}

		public void push(int data){
			stack[++top] = data;
		}

		public int top(){
			if(top == -1){
				return -1;
			}
			return stack[top];
		}

		public int pop(){
			if(top == -1){
				return -1;
			}
			return stack[top--];
		}

		public int size(){
			return top+1;
		}
	}
}