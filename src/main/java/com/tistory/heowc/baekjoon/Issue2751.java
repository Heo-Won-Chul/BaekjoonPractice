package com.tistory.heowc.baekjoon;

import java.util.Scanner;

public class Issue2751 {

	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int [] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}
		quickSort(array, 0, count - 1);
		for (int number : array) {
			sb.append(number).append("\n");
		}
		System.out.print(sb.toString());
	}

	private static void quickSort(int[] data, int l, int r){
		int left = l;
		int right = r;
		int pivot = data[(l+r)/2];

		do{
			while(data[left] < pivot) left++;
			while(data[right] > pivot) right--;
			if(left <= right){
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		}while (left <= right);

		if(l < right) quickSort(data, l, right);
		if(r > left) quickSort(data, left, r);
	}
}
