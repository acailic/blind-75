package org.example.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSequence {


    public static void main(String[] args){
        System.out.println(longestCommonSequence("aca","ca"));
        System.out.println(longestCommonSequence("idemoodma","sadsadasdasdmos"));
    }

    public static int longestCommonSequence(String s1, String s2){
        // ako je jedan prazan vrati se
        int n=s1.length();
        int m= s2.length();
        int [][] dp = new int [n+1][m+1];
        List<List<String>> resultList = new ArrayList<>();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (s1.charAt(i) ==s2.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }


        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while(i > 0 && j > 0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
            } else if(dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println(lcs.reverse().toString());
        return dp[n][m];
    }
}
