package org.tcs;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int xor = 0;
		for(int i=0;i<N;i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);
	}
}
