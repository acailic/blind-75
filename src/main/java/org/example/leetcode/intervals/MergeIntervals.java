package org.example.leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    //// 1,3  2,6    8,10

    // time complexity nlogn
    // memory complexity n
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals ,(a,b)->Integer.compare(a[0],b[0]));
        ans.add(intervals[0]);
        for(int i=0;i<intervals.length;i++){
            int curStart = intervals[i][0];
            // ako se sledeci nalazi u opsegu, merguj
            if(curStart<=ans.get(ans.size()-1)[1]){
                //wrong
              //  ans.add(i,new int[]{ans.get(i)[0],Math.max(ans.get(i)[1],intervals[i][1])});
                ans.get(ans.size()-1)[1]=Math.max(ans.get(i)[1],intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }

        }
        int [][] res= new int[ans.size()][2];
        ans.toArray(res);
        return res;
    }
}
