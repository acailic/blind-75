package org.example.leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MeetingRooms2 {

    public int numberOfRooms(int [][] intervals) {
        int maxCount=0, count=0;
        int []  firstOnes =  Arrays.stream(intervals)
                .mapToInt(arr->arr[0]).toArray();
        int []  secondOnes = Arrays.stream(intervals)
                .mapToInt(arr->arr[1]).toArray();
        Arrays.sort(firstOnes);
        Arrays.sort(secondOnes);
        int s=0,e=0;
        while(s< intervals.length){
            if(firstOnes[s]<secondOnes[e]){
                count++;
                s++;
            } else {
                e++;
                count--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
