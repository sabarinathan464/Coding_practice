/*
 * Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result.
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of  3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:
Input 
5 -> Value of N, represents size of Arr
7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]
9-> Value of Arr[4]
Output :
3
 * 
 */




package org.tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
			System.out.println("Enter Array size :");
			int num = inp.nextInt();
			
			int[] arr = new int[num];
			System.out.println("Enter elements : ");
			for (int i = 0; i < num; i++) {
				arr[i] = inp.nextInt();
			}
			
			
			
			ArrayList<Integer> l1 = new ArrayList<>();
			l1.add(arr[0]);
			
			for(int i=1;i<num;i++) {	
				boolean isGreater = true; 	//[2,3,1,7,8,0]
				for(int j=0;j<i;j++) {
					if(arr[i]<=arr[j]) {
						isGreater = false;
						break;
					}
				}
				if(isGreater) {
					l1.add(arr[i]);
				}
				
			}
			
			System.out.println("Result is  :"+l1.size());
			inp.close();
	}
}
