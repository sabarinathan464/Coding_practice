package org.tcs;

import java.util.Iterator;
import java.util.Scanner;

/*Q1 Alice and her friends are playing a game of verbal Kho-Kho. Alice is acting as a mediator, and the rest of the N friends are seated on N chairs, one each.
Alice starts by providing a paper with a single-digit number to the friend present at number 1. Let�s denote friends by F, where F will be of size N. F[1]�F[N] 
represents friends seated respectively. After receiving the paper with a digit, F[1] will enact and try to tell F[2] without speaking. Similarly, F[2] will 
communicate to the next person i.e., F[3]. This continues until the last person F[N] understands the digit. Finally, the last person will write the digit on a 
separate paper and give it to Alice to compare both papers. If the digits are similar then, Alice will give a T-shirt to each friend. However, if the digits do not match, Alice will ask each friend�s digits, and she will offer the T-shirts to only those who understood the digits correctly.

Given N number of friends and digit array D, denoting the digit understood by each friend F.
 finds out how many of Alice�s friends have not enacted well OR did not understand the enactment
  by the previous friend correctly.
 * 
 */

public class Q1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number of Friends : ");
		int no = s1.nextInt();
		
		int[] arr = new int[no];
		System.out.println("Enter the digits for each one : ");
		for (int i = 0; i < no; i++) {
			arr[i] = s1.nextInt();
		}
		int count =0 ;
		for (int i = 1; i < no; i++) {
			if(arr[0] != arr[i]) {
				count++;
			}
		}
		System.out.println("No.of Mis-Matches are :"+count);
	}
}
