package com.tistory.heowc.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Issue4344 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int lineCount = Integer.parseInt(br.readLine());

		double sum = 0.0;
		int index = 0;
		double exceedCount = 0;

		for (int i = 0; i < lineCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int arrayCount = Integer.parseInt(st.nextToken());
			double [] scoreArray = new double[arrayCount];

			while (st.hasMoreTokens()) {
				double score = Double.parseDouble(st.nextToken());
				scoreArray[index++] = score;
				sum += score;
			}

			double average = sum/arrayCount;

			for (double score : scoreArray) {
				if (score > average) {
					exceedCount++;
				}
			}

			System.out.printf("%.3f%%\n", exceedCount / arrayCount * 100);

			sum = 0.0;
			index = 0;
			exceedCount = 0;
		}
	}
}
