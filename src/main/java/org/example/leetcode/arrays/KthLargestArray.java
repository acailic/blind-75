package org.example.leetcode.arrays;

import java.util.PriorityQueue;

public class KthLargestArray {

        // offer - logk
    // Time complexity: O(nlogk)
    // Space complexity: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue queue = new PriorityQueue<Integer>(k, (a, b)->a-b);
        // 3,2,1,5,6,4
        // 2th 5

        for (int num: nums ){
            queue.offer(num);
            if (queue.size()>k){
                queue.poll();
            }
        }
        return (int) queue.peek();
    }
}
