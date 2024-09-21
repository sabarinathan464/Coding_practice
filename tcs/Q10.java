package org.tcs;
import java.util.*;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day 
in the future to sell that stock.Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.

	Input Format:
	The input consists of an array prices, where prices[i] represents the price of the stock on the ith day. 
	The length of the array prices (number of days) will be between 1 and 10^5. Each element of the array prices will
	be an integer between 0 and 10^4.

	Constraints:
	1 <= prices.length <= 10^5 0 <= prices[i] <= 10^4
	
	Output Format:
	Return an integer representing the maximum profit that can be achieved from this transaction. If no profit can be achieved, return 0.

	Sample Input 0:
	6
	7 1 5 3 6 4
	
	Sample Output 0:
	5
 */
public class Q10 {
	static boolean isPrime(int n) {
		int count=0;
		for(int i =1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		return count == 2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=2;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				if(isPrime(i) && isPrime(j) && isPrime(i+j)) {
					System.out.println(i+" ");
				}
			}
			sc.close();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
