/*
 * You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value
 and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Input Format
First line: An integer n representing the length of the array nums. 
Second line: n space-separated integers representing the elements of the array nums. 
Third line: An integer k representing the size of the subarray.

Constraints
n == nums.length 1 <= k <= n <= 105 -104 <= nums[i] <= 104
Output Format
A single line containing a floating-point number representing the maximum average value of a contiguous subarray 
of length k in the given array nums.
Sample Input 0

6
1 12 -5 -6 50 3
4
Sample Output 0

12.75000
 */

package org.tcs;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int K = sc.nextInt();
		
		int left = 0;
		int right = K;
		
		double finalSum = 0;

		for(int i=0;i<K;i++) {
			finalSum += arr[i];
		}
		
		double currentSum = finalSum;
		
		while(right<N) {
			currentSum = currentSum - arr[left]+arr[right];
			if(currentSum > finalSum) {
				finalSum = currentSum;
			}
			left++;
			right++;
		}

		System.out.printf("%.5f",finalSum / K);
		sc.close();
	}
}
