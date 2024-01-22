package org.example.leetcode.other;

public class AlternateMainLeetCode108 {

    public int alternatingSubarray(int[] A) {
        int n = A.length, res = -1, dp = -1;
        for (int i = 1; i < n; ++i, res = Math.max(res, dp))
            if (dp > 0 && A[i] == A[i - 2])
                dp++;
            else
                dp = A[i] == A[i - 1] + 1 ? 2 : -1;
        return res;
    }

}
