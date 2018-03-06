package com.tistory.heowc.baekjoon;

import java.util.*;

public class Issue14919 {

    public static void main(String[] args) {
        final String DELIM = " ";
        final int MUL = 10000000;

        final Scanner scanner = new Scanner(System.in);
        final int m = Integer.parseInt(scanner.nextLine());
        final int L = MUL / m;
        final StringTokenizer st = new StringTokenizer(scanner.nextLine(), DELIM);

        int[] areas = new int[m];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = L * (i + 1);
        }

        int[] counts = new int[m];
        while (st.hasMoreTokens()) {
            int number = (int) Math.ceil(MUL * Double.parseDouble(st.nextToken()));
            int index = getIndexByArea(areas, number);
            counts[index]++;
        }

        System.out.println(getFormattedResult(counts));
    }

    private static int getIndexByArea(int[] areas, int actualNumber) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] > actualNumber) {
                return i;
            }
        }
        return -1;
    }

    private static StringBuilder getFormattedResult(int[] counts) {
        StringBuilder sb = new StringBuilder();
        for (int count : counts) {
            sb.append(count + " ");
        }
        return sb;
    }
}