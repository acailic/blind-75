package org.example.leetcode.intervals;

import java.util.Arrays;

public class MeetingRooms1 {

    public boolean isPossible(int [][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],a[0]));
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int curStart= intervals[i][0];
            if(curStart>=end){
                return false;
            }
            end=curStart;
        }
        return true;
    }
}
