package org.example.leetcode.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramSorter {

    //AnaGrams are words that have the same characters but in different order.
    //For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.

    //Given a list of words, group the anagrams together.
    //For example, if the given list of words is {“keep”, “peek”, “school”, “boo”, “keep”, “pook”},
    //then output list of anagrams are {{“keep”, “peek”, “pook”}, {“school”}, {“boo”}}.


    // create a mapof string and list of strings
    // go through each string and sort it
    // for each key, add word to list
    // collect all lists and return
    public String[] sortAnagrams(String[] strs) {
        // for each string sort it and add to map
        // if key exists, add to list
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        // collect all lists and return
        List<String> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            result.addAll(list);
        }
        return result.toArray(new String[0]);

    }


}
