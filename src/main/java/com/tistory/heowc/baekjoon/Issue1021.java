package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.*;

public class Issue1021 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer firstSt = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(firstSt.nextToken());
		int m = Integer.parseInt(firstSt.nextToken());

		int [] array = toArray(br.readLine(), m);
		List<Integer> list = toDeque(n);

		for (int i = 0; i < m; i++) {
			count += addCount(array[i], list);
		}

		System.out.print(count);
	}

	private static int addCount(int index, List<Integer> list) {
		int count = 0;

		int size = list.size() - 1;
		while (true) {
			int position = list.indexOf(index);
			int firstStep = position;
			int lastStep = size - position;

			if (firstStep == 0) {
				list.remove(0);
				return count;
			}
			if (firstStep > lastStep) {
				list.add(0, list.remove(size));
				count++;
			} else {
				list.add(size, list.remove(0));
				count++;
			}
		}
	}

	private static List<Integer> toDeque(int size) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= size; i++) {
			list.add(i);
		}
		return list;
	}

	private static int [] toArray(String value, int length) {
		int [] array = new int[length];
		StringTokenizer st = new StringTokenizer(value);
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		return array;
	}
}