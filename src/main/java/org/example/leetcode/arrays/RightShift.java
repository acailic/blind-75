package org.example.leetcode.arrays;

import java.util.List;

public class RightShift {

    public int minimumRightShifts(List<Integer> nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return (maxIndex + 1) % nums.size();
    }
}
