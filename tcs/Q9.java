/*
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy. Children with a higher rating get more candies than their neighbors. Return the
 minimum number of candies you need to have to distribute the candies to the children.
Input Format

size of an array elements of an array

Constraints

n == ratings.length 1 <= n <= 2 * 104 0 <= ratings[i] <= 2 * 104

Output Format

integer

Sample Input 0
3
1 0 2
Sample Output 0
5

Sample Input 1
3
1 2 2
Sample Output 1
4
 */

package org.tcs;
import java.util.*;


public class Q9 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int candy[]=new int[n];
      int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int s=0;
       for(int i=0;i<n;i++){
           candy[i]=1;
       }
       for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]){
               candy[i]=candy[i-1]+1;
           }
           else{
               candy[i]=1;
           }
       }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                candy[i]=Math.max(candy[i+1]+1,candy[i]);
            }
        }
        for(int i=0;i<n;i++){
            s+=candy[i];
        }
        System.out.print(s);
        sc.close();
    }
}