package org.example.leetcode.arrays;

import java.util.PriorityQueue;

public class KthSmallest {

    // O(n log k) time complexity
    public static int findKthSmallestHeap(int[] nums, int k) {
        // heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b - a);
        for(int num:nums){
            queue.offer(num );
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }


    // O(n) time complexity
    // O(1) space complexity
    public static int findKthSmallestQuickSellect(int[] nums, int k ){
        return quickSelect(nums, 0 , nums.length-1,k-1);
    }

    public static int quickSelect(int [] nums, int low, int high, int k ){
        int pivot =partitions(nums,low,high);
        if(k==pivot){
            return nums[pivot];
        } else if (pivot>k){
            return quickSelect(nums,low,pivot-1, k);
        } else {
            return quickSelect(nums,pivot+1,high,k);
        }
    }

    public static int partitions(int [] nums, int low, int high){
        int pivot= nums[high];
        int i =low;
        for(int j=low; j<high;j++){
            if(nums[j]<=pivot){
                swap(nums,i++,j);
            }
        }
        // pivot is at i so swap it with high
        swap(nums,i,high);
        return i;
    }


    public static void swap(int [] nums, int j, int i){
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }


    public  static void main(String[] args) {
        int res= findKthSmallestHeap(new int[]{1,2,3,4},3);
        System.out.println("res: " +res);
        int res2= findKthSmallestQuickSellect(new int[]{1,2,3,4},3);
        System.out.println("res: " +res2);
    }

}
