/*
 * A furnishing company is manufacturing a new collection of curtains. 
 * The curtains are of two colors aqua(a) and black (b). 
 * The curtains color is represented as a string(str) consisting of a’s and b’s of length N. 
 * Then, they are packed (substring) into L number of curtains in each box. 
 * The box with the maximum number of ‘aqua’ (a) color curtains is labeled. 
 * The task here is to find the number of ‘aqua’ color curtains in the labeled box.
Note :
If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. 
In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)
Example 1:
Input :
bbbaaababa -> Value of str
3    -> Value of L
Output:
3   -> Maximum number of a’s
Explanation:
From the input given above.
Dividing the string into sets of 3 characters each 
Set 1: {b,b,b}
Set 2: {a,a,a}
Set 3: {b,a,b}
Set 4: {a} -> leftover characters also as taken as another set
Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.
Hence, the output is 3.
 * 
 */

package org.tcs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int L = sc.nextInt();
		
		List<String> ss = new ArrayList<String>();
		
		int len = s.length();
		for(int i = 0 ;i<len;i+=L) {
			if(i+L <= len) {
				ss.add(s.substring(i, i+L));		
			}
			else {
				ss.add(s.substring(i));
			}
		}
		
		
		int maxcount = Integer.MIN_VALUE;
		
		
		for(String res_Str : ss) {
			int count = 0;
			for(char c : res_Str.toCharArray()) {
				if(c == 'a') {
					count++;
				}
				if(count>maxcount) {
					maxcount = count;
				}
			}
		}
		
		System.out.println(maxcount);
		sc.close();
		}
	}
