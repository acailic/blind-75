package org.example.leetcode.test2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
