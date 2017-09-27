package com.tistory.heowc.baekjoon;

import java.util.*;
import java.util.stream.Collectors;

public class Issue1966 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int caseCount = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < caseCount; i++) {
			Paper selectedPaper = null;
			int orderNumber = 0;

			StringTokenizer firstSt = new StringTokenizer(scanner.nextLine());
			int n = Integer.parseInt(firstSt.nextToken());
			int m = Integer.parseInt(firstSt.nextToken());
			String line = scanner.nextLine();
			StringTokenizer secondSt = new StringTokenizer(line);

			Queue<Paper> queue = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				Paper paper = new Paper(j, Integer.parseInt(secondSt.nextToken()));
				if (m == j) {
					selectedPaper = paper;
				}
				queue.offer(paper);
			}

			List<Paper> list = queue.stream().sorted((a, b) -> b.order - a.order).collect(Collectors.toList());

			while(true) {
				Paper paper = queue.remove();
				if (list.get(0).order == paper.order) {
					list.remove(0);
					orderNumber++;
					if (selectedPaper.seq == paper.seq) {
						System.out.println(orderNumber);
						break;
					}
				} else {
					queue.offer(paper);
				}
			}

		}
	}

	static class Paper {
		int seq;
		int order;

		Paper(int seq, int order) {
			this.seq = seq;
			this.order = order;
		}
	}
}
