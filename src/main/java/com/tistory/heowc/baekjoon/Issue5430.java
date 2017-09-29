package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.*;

public class Issue5430 {

	public static void main(String [] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < caseCount; i++) {
			char [] executeArray = br.readLine().toCharArray();

			br.readLine();
			String arrayStr = br.readLine();
			arrayStr = arrayStr.substring(1, arrayStr.length() - 1);
			StringTokenizer st = new StringTokenizer(arrayStr, ",");
			AC ac = new AC();
			while(st.hasMoreElements()) {
				ac.add(st.nextToken());
			}

			sb.append((executeAll(ac, executeArray) ? ac.printArray() : "error") + "\n");
		}

		System.out.print(sb);
	}

	private static boolean executeAll(AC ac, char [] executeArray) {
		for(char execute : executeArray) {
			if ('R' == execute) {
				ac.R();
			}
			if ('D' == execute) {
				if (!ac.D()) {
					return false;
				}
			}
		}
		return true;
	}

	static class AC {
		private String [] array = new String[100000];
		private int frontIndex = 0;
		private int endIndex = 0;
		private boolean isFront = true;

		void add(String number) {
			array[endIndex++] = number;
		}

		void R() {
			int temp = frontIndex;
			frontIndex = endIndex;
			endIndex = temp;
			isFront = !isFront;
		}

		boolean D() {
			if (isEmpty()) {
				return false;
			}

			if (isFront) {
				frontIndex++;
			} else {
				frontIndex--;
			}
			return true;
		}

		boolean isEmpty() {
			return frontIndex == endIndex;
		}

		String printArray() {
			if (isEmpty()) {
				return "[]";
			}

			StringBuilder sb = new StringBuilder();
			if (isFront) {
				sb.append("[" + array[frontIndex]);
				for (int i = frontIndex + 1; i < endIndex; i++) {
					sb.append("," + array[i]);
				}
			} else {
				sb.append("[" + array[frontIndex - 1]);
				for (int i = frontIndex - 2; i >= endIndex; i--) {
					sb.append("," + array[i]);
				}
			}
			return sb.append("]").toString();
		}
	}
}
