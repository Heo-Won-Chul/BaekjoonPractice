package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z="," ").length());
	}
}
