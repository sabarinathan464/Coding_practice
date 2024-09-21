package org.tcs;
/*
 * Write a function differenceOfMultiples(n, m) that takes two integers, n and m, as arguments. 
 * The function should compute the sum of all numbers from 1 to m (both inclusive) that are divisible 
 * by n and the sum of all numbers from 1 to m that are not divisible by n. Then, it should return the 
 * absolute difference between these two sums.

Note:
You should compute the sum of numbers divisible by n and the sum of numbers not divisible by n. 
The result should be the absolute difference between these two sums. 
Example:
Input:
n: 4 
m: 20 
Output:
90 
Explanation:
Sum of numbers divisible by 4: 4 + 8 + 12 + 16 + 20 = 60 
Sum of numbers not divisible by 4: 1 + 2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150 
Difference: 150 - 60 = 90
 */
import java.util.Scanner;

public class Q16 {
	private static int differenceOfMultiples(int n,int m) {
		
		int divisible_sum = 0;
		int non_divisible_sum = 0;
		
		for(int i=1;i<=m;i++) {
			if(i%n == 0) {
				divisible_sum += i;
			}
			else {
				non_divisible_sum += i;
			}
		}
		return Math.abs(divisible_sum - non_divisible_sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int res = differenceOfMultiples(n,m);
		System.out.println(res);
		sc.close();
		}
}
