package org.example.leetcode.arrays;

public class LongestPalindromicSubs {
    /*
        Given a string s, find the longest palindromic subsequence's length in s.

        A subsequence is a sequence that can be derived from another
        sequence by deleting some or no elements without changing the order of the remaining elements. */
    public int longestPalindromeSubseq(String s) {
        //dynamic dp
        int n =s.length();
        int [][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for(int i=n-1;i>=0;i-- ) {
            for (int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)) {
                    dp[i][j] = dp[i][j]+2;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }


        return dp[0][n-1];
    }

              //y
//    [[1, 2, 3, 3, 4],
//      [0, 1, 2, 2, 3],
//      [0, 0, 1, 1, 3],  //x
//     [0, 0, 0, 1, 1],
//      [0, 0, 0, 0, 1]]

    // cbbd
    //c
    //b
    //b   3
    //d    1
    public int longestPalindromeSubseq1(String s) {
        int best_len=0;
        int s_lenght= s.length();
        //// abbab

        for (int mid=0;mid<s_lenght;mid++){
            for(int x=0; s_lenght>mid+x && 0<=mid-x; x++ ){
                if(s.charAt(mid+x)!=s.charAt(mid-x)){
                    break;
                }
                int len = 2*x+1;
                if(best_len<len){
                    best_len=len;
                }

            }
        }


        for (int mid=0;mid<s_lenght-1;mid++){
            for(int x=1; s_lenght>mid+x && 0<=mid-x+1; x++ ){
                if(s.charAt(mid+x)!=s.charAt(mid-x+1)){
                    break;
                }
                int len = 2*x;
                if(best_len<len){
                    best_len=len;
                }

            }
        }
        //
        return best_len;
    }
}
