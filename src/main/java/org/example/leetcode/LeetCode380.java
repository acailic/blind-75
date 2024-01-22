package org.example.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode380 {

    public int maxFrequencyElements(int[] nums) {
        //List<Integer> maxs = Arrays.stream(nums).group().colect(Colectors.toList());
        Map<Integer,Long> counter= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(num->num,Collectors.counting()));
        long max = counter.values().stream().max(Long::compareTo).orElse(null);
        return counter.entrySet().stream().filter(entry->entry.getValue()==max).map(Map.Entry::getValue).mapToInt(Long::intValue).sum();
    }
}
