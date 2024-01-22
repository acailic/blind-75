package org.example.leetcode.arrays.subarrays;

public class SumOfAllSubArrays {


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // [1], [1,2], [1,2,3], [2], [2,3], [3]
        // sum = 1 + 3 + 6 + 2 + 5 + 3 = 20
        System.out.println(subArraySum(arr, arr.length));
    }


    public static long subArraySum(int arr[], int n){
//        long sum = 0;
//        for(int i=0; i<n; i++)
//            sum += arr[i] * (i+1) * (n-i);
//        return sum;
        long sum=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                temp+=arr[j];
                sum+=temp;
            }

        }
        return sum;
    }
}
