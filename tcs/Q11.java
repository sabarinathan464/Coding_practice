/*
 * Imagine you are participating in a national coding competition where you've been challenged to display your mastery of loops and arrays. 
 * Your task is to develop a program that generates a unique spiral pattern with numbers, starting from 1 and moving in a clockwise direction 
 * until the entire matrix is filled. This task not only tests your algorithmic skills but also your ability to manipulate multidimensional arrays efficiently.
 *  Your solution will be used to generate patterns for a new kind of puzzle game that is both entertaining and educational, aiming to enhance logical thinking 
 *  and problem-solving skills among users of all ages.

	Input Format:
	The input consists of a single integer, n, representing the size of the square matrix (n x n) to be generated.
	Constraints:
	1<=n<=100, where n is the dimension of the square matrix.
	Output Format:
	The output should be an n x n matrix filled with integers from 1 to n*n, arranged in a clockwise spiral pattern.
	 Each number should be formatted to occupy exactly two spaces, ensuring alignment for single and double-digit numbers, 
	 followed by a space character.
	 
	 
	Sample Input 0:
	5
	Sample Output 0:
	
	01 02 03 04 05 
	16 17 18 19 06 
	15 24 25 20 07 
	14 23 22 21 08 
	13 12 11 10 09
 */

package org.tcs;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int dp[][] = new int[Num][Num];
		int data = 1;
		
		int ltors = 0  ,ltore = Num-1  ,ltorp = 0  ; 					
		int ttobs = 1  ,ttobe = Num-1  ,ttobp = 4  ; 
		int rtols = Num-2  ,rtole = 0  ,rtolp = 4  ; 
		int btots = Num-2  ,btote = 1  ,btotp = 0  ; 
		
		for(int j=0;j<Num/2;j++) {
				for(int i=ltors;i<=ltore;i++) {
					dp[ltorp][i] = data;
					data++;
				}
				for(int i=ttobs;i<=ttobe;i++) {
					dp[i][ttobp] = data;
					data++;
				}
				for(int i=rtols;i>=rtole;i--) {
					dp[rtolp][i] = data;
					data++;
				}
				for(int i=btots;i>=btote;i--) {
					dp[i][btotp] = data;
					data++;
				}
				
				ltors++;ltore--;ltorp++;
				ttobs++;ttobe--;ttobp--;
				rtols--;rtole++;rtolp--;
				btots--;btote++;btotp++;
				
		}
		
		for(int i=0;i<Num;i++) {
			for(int j =0;j<Num;j++) {
				System.out.printf("%02d ",dp[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
