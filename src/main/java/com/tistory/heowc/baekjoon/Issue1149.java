package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Issue1149 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int[][] cost = new int[3][size];

		StringTokenizer st = new StringTokenizer(br.readLine());

		cost[0][0] = Integer.parseInt(st.nextToken());
		cost[1][0] = Integer.parseInt(st.nextToken());
		cost[2][0] = Integer.parseInt(st.nextToken());

		for(int i = 1; i < size; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st2.nextToken());
			int g = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());

			cost[0][i] = r + Math.min(cost[1][i-1], cost[2][i-1]);
			cost[1][i] = g + Math.min(cost[0][i-1], cost[2][i-1]);
			cost[2][i] = b + Math.min(cost[0][i-1], cost[1][i-1]);
		}

		System.out.print(Math.min(cost[0][size-1], Math.min(cost[1][size-1], cost[2][size-1])));
	}
}
