package org.tcs;
/*
 * You are given a function: int findRangeCount(int arr[], int num, int diff); 
 * The function accepts: • An integer array arr. • An integer num. • An integer diff. 
 * The function should return the number of elements in arr that fall within the range defined by num - diff to num + diff (both inclusive). 
 * If no elements in arr fall within this range, return -1.

	Note If there is no element in arr that falls within the specified range, return -1.
	Example ::::
	
	Input: arr: 20 25 30 35 40 45
	               num: 30 
	               diff: 5
	Output: 3
	 */
import java.util.Scanner;

public class Q15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int diff = sc.nextInt();
		
		int ans = FindRangeCount(arr,num,diff);
	    System.out.println(ans);
	    sc.close();
	}

	private static int FindRangeCount(int[] arr, int num, int diff) {
		// TODO Auto-generated method stub
		int count=0;
		int start_range = num-diff;
		int last_range = num+diff;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= start_range && arr[i] <= last_range) {
				count++;
			}
		}
		return count>0?count:-1;
	}
}
