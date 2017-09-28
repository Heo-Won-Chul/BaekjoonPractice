package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue10866 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int caseCount = scanner.nextInt();
		Deque<String> deque = new ArrayDeque<>(caseCount);

		for (int i = 0; i <= caseCount; i++) {
			String execute = scanner.nextLine();
			if (execute.startsWith(Execute.PUSH_FRONT.name().toLowerCase())) {
				StringTokenizer st = new StringTokenizer(execute);
				st.nextToken();
				deque.addFirst(st.nextToken());
			}

			if (execute.startsWith(Execute.PUSH_BACK.name().toLowerCase())) {
				StringTokenizer st = new StringTokenizer(execute);
				st.nextToken();
				deque.addLast(st.nextToken());
			}

			if(Execute.POP_FRONT.name().equalsIgnoreCase(execute)) {
				sb.append(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
			}

			if(Execute.POP_BACK.name().equalsIgnoreCase(execute)) {
				sb.append(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
			}

			if(Execute.SIZE.name().equalsIgnoreCase(execute)) {
				sb.append(deque.size() + "\n");
			}

			if(Execute.EMPTY.name().equalsIgnoreCase(execute)) {
				sb.append(deque.isEmpty() ? "1\n" : "0\n");
			}

			if(Execute.FRONT.name().equalsIgnoreCase(execute)) {
				sb.append(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
			}

			if(Execute.BACK.name().equalsIgnoreCase(execute)) {
				sb.append(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
			}
		}
		System.out.print(sb);
	}

	enum Execute {
		PUSH_FRONT, PUSH_BACK, POP_FRONT, POP_BACK, SIZE, EMPTY, FRONT, BACK
	}
}
