package org.example.leetcode.test2;


// Lexicographically Maximum Possible: https://takeitoutamber.medium.com/hackerrank-coding-interview-string-conversion-lexicographically-maximum-possible-90756b82c184
//Question —
//
//        |s| is the length of string s. Form a new string b as follows.
//
//        String b is initially empty.
//
//        For each i where 1 ≤ i ≤ |s|:
//
//        Append s[i-1] to the end of b.
//        Reverse the string b.
//        Before creating b, reorder s to produce the b that is the lexicographically maximum possible.


public class LexicographicallyMaximumPossible {


    // time complexity: O(n)
      // space complexity: O(1)
    String getOptimalString(String s, int k) {
        // Write your code here
        char[] chars = s.toCharArray();
        int[] count = new int[26];
        for (char c : chars) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            while (count[i] > 0) {
                if (k > 0) {
                    sb.append((char) (i + 'a'));
                    count[i]--;
                    k--;
                } else {
                    break;
                }
            }
        }
        return sb.toString();
    }
}
