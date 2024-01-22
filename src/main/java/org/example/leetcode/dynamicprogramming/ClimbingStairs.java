package org.example.leetcode.dynamicprogramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int [] dp = new  int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // 0 1 2 3 4 5
       //1 2 3
       //

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;

        for (int i = 2; i < n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }
}
