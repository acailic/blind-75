package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestMain {


    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, int[]> nm = new HashMap<>();
        int m=mat.length;
        int n=mat[0].length;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                nm.put(mat[i][j], new int[]{i, j});
            }
        }
        int a[]=new int[m];
        int b[]=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            int c[] = nm.get(arr[i]);
            a[c[0]]++;
            System.out.println("a[c[0]]:"+a[c[0]]);
            b[c[1]]++;
            System.out.println("b[c[1]]:"+b[c[1]]);
            if(a[c[0]]==n||b[c[1]]==m)
            {
                System.out.println("i:"+i+ " arr[i]:"+arr[i]);
                return i;
            }
        }
        return -1;
    }


    public int minOperations(int n) {
        int c=0;
        while(n > 0){
            c++;
            // explain me next line: Math.log(n) / Math.log(2) is
            // the log of n in base 2.
            double x = Math.log(n) / Math.log(2);

            int prevPower = (int) Math.pow(2,(int) x);
            int nextPower = (int) Math.pow(2,(int) x + 1);

            int diff1 = n - prevPower;
            int diff2 = nextPower - n;

            if(diff1 < diff2) n = diff1;
            else n = diff2;
        }
        return c;
    }


    class Solution {
        public int[] divisibilityArray(String word, int m) {
            long x=0;
            int n=word.length();
            int[] ans = new int[n];
            for(int i=0;i<word.length();i++)
            {
                x=x*10+(word.charAt(i)-'0');
                if(x%m==0) ans[i]=1;else ans[i]=0;
                x%=m;
            }
            return ans;
        }
    }

    /// fix line
    int nums[] = {1,2,3,4,5,6,7,8,9,10};
    Set<Integer> uniqueVal = Arrays.stream(nums).boxed().collect(Collectors.toSet());



}
