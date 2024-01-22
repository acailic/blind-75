package org.example.leetcode.test2;


import java.util.Arrays;

public class CoinChange {


    /// coin change problem
    // given a list of coins and a target amount
    // find the minimum number of coins needed to make the change
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange.coinChange(coins, amount));
        // correct answer is 3
    }

    // time complexity: O(n*m)
    // space complexity: O(n)
//    public int coinChange(int[] coins, int amount) {
//        int max = amount+1;
//        int [] dp = new int[amount+1];
//        Arrays.fill(dp,max);
//        dp[0]=0;
//        for(int i=1;i<=amount;i++){
//            for(int j=0; j< coins.length; j++) {
//                if (coins[j]<=i){
//                    dp[i]= Math.min(dp[i], dp[i-coins[j]]+1);
//                }
//
//        }}
//        return dp[amount]>amount?-1:dp[amount];
//
//    }
    // can also be solved using dfs, but it will be exponential time complexity
    // time complexity bfs
    public int coinChange(int[] coins, int amount) {
        int max=amount+1;
        int [] dp = new int [amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int i=1; i<=amount; i++){
            for ( int j=0; j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount]>amount? -1:dp[amount];
    }

}
