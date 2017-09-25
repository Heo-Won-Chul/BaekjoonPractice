package com.tistory.heowc.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Issue10845 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		MyQueue customQueue = new MyQueue();
		int executeCount = scanner.nextInt();

		for (int i = 0; i <= executeCount; i++) {
			execute(sb, customQueue, scanner.nextLine());
		}

		System.out.print(sb);
	}

	private static void execute(StringBuilder sb, MyQueue myQueue, String contentOfLine) {
		if (contentOfLine.startsWith(Execute.PUSH.name().toLowerCase())) {
			StringTokenizer st = new StringTokenizer(contentOfLine);
			st.nextToken();
			myQueue.push(Integer.parseInt(st.nextToken()));
		}

		if (Execute.POP.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(myQueue.pop() + "\n");
		}

		if (Execute.EMPTY.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(myQueue.empty() + "\n");
		}

		if (Execute.SIZE.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(myQueue.size() + "\n");
		}

		if (Execute.FRONT.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(myQueue.front() + "\n");
		}

		if (Execute.BACK.name().equalsIgnoreCase(contentOfLine)) {
			sb.append(myQueue.back() + "\n");
		}
	}

	private enum Execute {
		PUSH, POP, SIZE, EMPTY, FRONT, BACK
	}

	static class MyQueue {
		private int values[];
		private int end;
		private int front;

		MyQueue() {
			values = new int[10000];
			end = -1;
			front = -1;
		}

		int empty() {
			return front == -1 && end == -1 ? 1 : 0;
		}

		void push(int input) {
			if (empty() == 1) {
				values[++end] = input;
				front = 0;
			} else {
				values[++end] = input;
			}
		}

		int pop() {
			if (this.empty() == 1) {
				return -1;
			}

			if(front == end) {
				int retVal = values[front];
				front=-1;
				end=-1;
				return retVal;
			} else {
				return values[front++];
			}
		}

		int size() {
			return this.empty() == 1 ? 0 : end - front + 1;
		}

		int front() {
			return this.empty() == 1 ? -1 : values[front];
		}

		int back() {
			return this.empty() == 1 ? -1 : values[end];
		}
	}
}
