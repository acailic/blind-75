package org.example.leetcode.arrays;

public class SortColors {

    public void sortCountingColors(int[] nums) {

    }

    public void sortColors(int[] nums) {
        int low=0, mid=0, high= nums.length-1;
        while(high >=mid){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
             // move low
            } else if(nums[mid]==1){
                mid++;
            } else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
