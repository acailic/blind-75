package org.example.leetcode.test2;

import java.util.List;

public class SubbArrayDivision {

//    Subarray Division
//    Given a chocolate bar, two children, Lily and Ron, are determining how to share it.
//    Each of the squares has an integer on it.
//    Lily decides to share a contiguous segment of the bar selected such that:


    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int windowSum = 0;
        int ways = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }
        if (windowSum == d) {
            ways++;
        }
        for (int i = m; i < s.size(); i++) {
            windowSum = windowSum - s.get(i - m) + s.get(i);
            if (windowSum == d) {
                ways++;
            }
        }
        return ways;
    }

}
