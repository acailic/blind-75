package org.example.leetcode.arrays;

public class BuySellStock {
    /*
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing
        a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction.
        If you cannot achieve any profit, return 0.*/
    public int maxProfit(int[] prices) {
        int localMin = prices[0];
        int maxProfit= 0;
        for(int i =1; i<prices.length; i++){
            if(localMin<prices[i]){
                localMin=prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i]-localMin);
        }
        return maxProfit;
    }
    // time complexity: O(n)
    // space complexity: O(1)
}
