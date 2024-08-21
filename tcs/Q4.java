/*
 * Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.
Constraints-
1<=N<=100
Example 1:
Input :
10  -> Integer
Output :
5    -> result- Integer
Explanation:
Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
 * 		
 */





package org.tcs;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the decimal value");
		int n1 = in.nextInt();
		int[] arr = new int[100];
		int count=0;
		while(n1>0) {
			arr[count] = n1%2;
			n1=n1/2;
			count++;
		}
		
		
		for(int j = count-1;j>=0;j--) {
			if(arr[j] == 1) {
				arr[j] = 0;
			}
			else {
				arr[j] = 1;
			}
		}
		

		int res = 0;
		int power = 0;
		System.out.println("Result :");
		for(int i = 0; i<count ; i++){
			res = (int) (res + ((Math.pow(2, power)*arr[i])));
			power++;
		}

		
		System.out.println(res);
	}
}
