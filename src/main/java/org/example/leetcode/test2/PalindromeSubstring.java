package org.example.leetcode.test2;

public class PalindromeSubstring {


    public static void main(String[] args) {
        PalindromeSubstring palindromeSubstring = new PalindromeSubstring();
        String s = "abc";
        int res = palindromeSubstring.countSubstrings(s);
        System.out.println(res);
    }


    // Time complexity: O(n^2)
    // Space complexity: O(n^2)
    // Count the number of palindromic substrings
    // 1. dp[i][j] represents whether s[i:j] is a palindrome
    // 2. dp[i][j] = (s[i] == s[j] && dp[i + 1][j - 1])
    // 3. count the number of true in dp
    // 4. return count

    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }

                if (dp[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }


}
