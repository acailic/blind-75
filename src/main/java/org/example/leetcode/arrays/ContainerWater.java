package org.example.leetcode.arrays;

public class ContainerWater {

    public int  maxArea(int[] height) {
        int left=0,right=height.length-1,max=0;
        while(left<right){
            int distance=right-left;
            int maxHeight= Math.min(height[left],height[right]);
            max = Math.max(max,distance*maxHeight);
            if(height[left]>height[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;
    }
}
