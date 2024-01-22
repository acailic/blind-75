package org.example.leetcode.arrays.subarrays;

import java.util.Stack;

public class SumOfSubarrayMinimums {
//    Initialize a stack to keep track of the elements in the array.
//    Iterate over the array. For each element, while the stack is not empty and the top element of the stack is greater than the current element, pop the stack.
//    For each popped element, calculate the area of the rectangle that can be formed using the popped element as the smallest element. Add the area to the sum.
//    Push the current element to the stack.
//    After the iteration, while the stack is not empty, pop the stack and calculate the area of the rectangle that can be formed using the popped element as the smallest element. Add the area to the sum.
//

    public int sumOfMinOfSubarrays(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            left[i] = (stack.isEmpty() ? -1 : stack.peek());
            stack.push(i);
        }

        stack.clear();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            right[i] = (stack.isEmpty() ? nums.length : stack.peek());
            stack.push(i);
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] * (i - left[i]) * (right[i] - i);
        }

        return sum;
    }

}
