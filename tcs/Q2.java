package org.tcs;

import java.util.Scanner;

/*Bob is going to bet today on horse riding. There are N horses listed in a sequence of 1 to N.

The probability of winning each horse is different so the prices for making a bet on the horses 

are not the same. There is no limit on the number of horses on which he can bet, but he thinks that

 if he bets on a continuous sequence of horses then he has a better chance to win. Bob will get K units 
 
 of money if any horse on which he bets will win. But as the award is only K units so he wants to put money 
 
 less than K. Bob wants to bet on as many horses as he can. As you are his best friend, he reached out to you 
 
 for help, can you please find the length of the maximum continuous sequence of horses on which Bob can make a bet,
 
 and remember he will invest money less than K units. If there is more than one possible combination, Bob will
  
 bet randomly on any one of them.

Given the number of horses(N), reward money(K), and price of betting on N horses in order.

Hint: For each starting index of a horse, its end index in sequences will be equal to or greater than the end 

index of the previous starting index.

 */

public class Q2 {
	public static int maxHorsesSequence(int[] prices, int N, int K) {
        int maxLength = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            currentSum += prices[end];

            // Shrink the window until the current sum is less than K
            while (currentSum >= K) {
                currentSum -= prices[start];
                start++;
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int N = 5;  // Number of horses
        int K = 12; // Reward money
        int[] prices = {2, 1, 4, 5, 3}; // Prices for betting on each horse

        int result = maxHorsesSequence(prices, N, K);
        System.out.println("Maximum continuous sequence length: " + result);
    }
}
