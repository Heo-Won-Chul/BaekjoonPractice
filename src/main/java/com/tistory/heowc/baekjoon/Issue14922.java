package com.tistory.heowc.baekjoon;

import java.io.*;
import java.util.*;

public class Issue14922 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer sr = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sr.nextToken());
        }

        int minP = 0;
        double minAvg = Double.MAX_VALUE;

        if (N != 2) {
            for (int i = 2; i < N; i++) {
                double avg = (A[i] + A[i - 1] + A[i - 2]) / 3.0;
                if (minAvg > avg) {
                    minAvg = avg;
                    minP = i - 2;
                }
            }

            for (int i = 1; i < N; i++) {
                double avg = (A[i] + A[i - 1]) / 2.0;
                if (minAvg > avg) {
                    minAvg = avg;
                    minP = i - 1;
                }
            }


        }

        System.out.print(minP);
    }
}