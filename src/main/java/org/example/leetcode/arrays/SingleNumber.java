package org.example.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {-1,-1,-2};
        System.out.println(singleNumber.singleNumber2(nums));
    }

    public int singleNumberXOR(int[] nums) {
        int ones = 0;
        int threes = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~threes;
            threes = (threes ^ num) & ~ones;
        }
        return ones;
    }

    public int singleNumber2(int[] nums) {
        int ones=0,twos=0;
        for(int num : nums){
            num = Math.abs(num);
            System.out.println("num:"+num);
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
            System.out.println("ones:"+ones+" twos:"+twos);
        }
        System.out.println("1s:"+ones+ " 2s:"+twos+". ");
        return ones;
    }



    // wrong, extra space for map
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> counterMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            counterMap.put(nums[i],counterMap.getOrDefault(nums[i],0)+1);
        }
        return (int)counterMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1).findFirst().get().getKey();

    }

}
