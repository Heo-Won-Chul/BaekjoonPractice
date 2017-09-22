package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.Stack;

public class Issue9012 {

	public static void main(String [] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int caseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < caseCount; i++) {
			sb.append(isVPS(br.readLine()) ? "YES\n" : "NO\n");
		}

		System.out.print(sb);
	}

	private static boolean isVPS(String value) {
		Stack<Character> stack = new Stack<>();

		for(Character character : value.toCharArray()) {
			if (character == '(') {
				stack.push(character);
			} else {
				if (stack.empty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.empty();
	}
}