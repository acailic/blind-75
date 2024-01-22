package org.example.leetcode.test;

public class MedianOfTwoSortedArrays {

    // median of two sorted arrays
    // median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
    // For example, for arr = [2,3,4], the median is 3.

    public int getMedian(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            } else {
                merged[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            merged[k++]=nums1[i++];
        }
        while(j<nums2.length){
            merged[k++]=nums2[j++];
        }
        int mid = merged.length/2;
        if(merged.length%2==0){
            return (merged[mid]+merged[mid-1])/2;
        } else {
            return merged[mid];
        }
    }

    /// get median 2 optimized, logn
    public int getMedian2(int[] nums1, int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int low=0,high=n1;
        while(low<=high){
            int cut1=(low+high)/2;
            int cut2=(n1+n2+1)/2-cut1;
            int left1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int left2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int right1=cut1==n1?Integer.MAX_VALUE:nums1[cut1];
            int right2=cut2==n2?Integer.MAX_VALUE:nums2[cut2];
            if(left1<=right2 && left2<=right1){
                if((n1+n2)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2;
                } else {
                    return Math.max(left1,left2);
                }
            } else if(left1>right2){
                high=cut1-1;
            } else {
                low=cut1+1;
            }
        }
        return 0;
    }

}
