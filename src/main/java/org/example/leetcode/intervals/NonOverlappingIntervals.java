package org.example.leetcode.intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        //Comparator.comparingInt(a -> a[1] - NO
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        int end=intervals[0][1];
        int forRemoval =0;
        for (int i=1 ;i< intervals.length; i++){
            int startCurr = intervals[i][0];
            if(end>startCurr) {
                forRemoval++;
            } else {
                end = intervals[i][1];
            }
        }
        return forRemoval;
    }

}
