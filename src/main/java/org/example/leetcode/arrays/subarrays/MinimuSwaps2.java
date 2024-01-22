package org.example.leetcode.arrays.subarrays;

public class MinimuSwaps2 {

    // time complexity: O(n)
    // space complexity: O(1)
    static int minimumSwaps(int[] arr) {
        int n =arr.length;
        int swaps=0;
        for(int i=0;i<n;i++){
            while(arr[i]!=i+1) {
                swap(arr, arr[i]-1, i);
                swaps++;
            }

        }
        return swaps;
    }

    public static void swap(int [] arr, int low, int high) {
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
