package org.example.leetcode.test;

public class MaximumSumPath {

    // Maximum Sum Path


    public int maxPathSum(int[][] grid) {
        int max = 0;
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int [][] dp = new int [n][m];
        dp[0][0]=grid[0][0];

        for(int i=0;i<n;i++){
            dp[i][0] = dp[i-1][0]+ grid[i][0];
        }
        for(int i=0;i<m;i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[m-1][m-1];
    }

    public void dfs(int [][]grid , int i, int j){
        //stay on grid

        /// mark visitedƒ

        // go directions
    }
}
