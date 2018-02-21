package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue14487 {

    private static final String DELIM = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), DELIM);

        int maxCost = 0;
        int sum = 0;

        while (st.hasMoreTokens()) {
            int cost = Integer.parseInt(st.nextToken());
            sum += cost;

            if (cost > maxCost) {
                maxCost = cost;
            }
        }

        System.out.println(sum - maxCost);
    }
}
