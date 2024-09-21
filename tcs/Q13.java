package org.tcs;
/*
 * Imagine you are developing a utility for a software application that processes large datasets of integers.
 *  One of the features required is to sort these integers such that the even numbers are in descending order
 *   and the odd numbers are in ascending order. This feature is essential for a specific analytical task where 
 *   the ordering of numbers based on their parity and magnitude provides meaningful insights.

Input Format
An integer n representing the number of elements in the array. An array of n integers.

Constraints

No Constraints

Output Format

A single line of space-separated integers representing the sorted array, where even numbers are in descending order, and odd numbers are in ascending order.

Sample Input 0

4
1 2 3 4
Sample Output 0

4 2 1 3
Sample Input 1

6
2 4 6 8 12 56
Sample Output 1

56 12 8 6 4 2
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<N;i++){
            if((arr[i] & 1) == 0){
                arr[i] *= -1;
            } 
        }
        Arrays.sort(arr);

         for(int i=0;i<N;i++){
            if((arr[i] & 1) == 0){
                arr[i] *= -1;
            } 
         }   
        
        for(int i=0;i<N;i++) {
        	System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
