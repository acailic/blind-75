package org.example.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    // k - size of array
    // n - target number
    // Return a list of all possible valid combinations. The list must not contain the same combination twice,
    // and the combinations may be returned in any order.
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;

    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int k, int remain, int start) {
        if (tempList.size() > k) {
            return;
        }
        if (tempList.size() == k && remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            backtrack(result, tempList, k, remain - i, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
