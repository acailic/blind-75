# Arrays

### Min rotated sorted array
Binary search. If mid is greater than right, search right. Else search left.

### Two sum
Map of value to index. If complement is in map, return indices. Else add value to map.
### Kth smallest 
Heap of size k. If heap size is less than k, add element. If heap size is k, add element if it is less than max element in heap. Remove max element from heap.
Quick select. Partition array around pivot. If pivot is kth smallest, return pivot. Else recurse on left or right subarray.
### Merge Intervals
Sort intervals by start time. Iterate through intervals. If current interval start time is less than previous interval end time, merge intervals. Else add interval to result.
### Subarray Sum
Map of sum to count. If sum is in map, increment count. Else add sum to map with count 1. If sum - k is in map, add count to result.
### Subarray Product
Sliding window. If product is less than k, increment right pointer. If product is greater than k, increment left pointer.
### Subarray Sum Equals K
### Subarray Sum Divisible by K
### Subarray Sum Closest to K

### Maximum Subarray
Max sum subarray. If sum is less than 0, reset sum to 0. Else add current element to sum. Update max sum.
### Min sum of all subarrays
Pointers beetween two stacks to go through array. If element is less than top of stack, pop from stack and add to other stack. Else add element to stack.
on end caluclate sum of all min subarrays.

### Contiguous Array
### SubArrayBeauty

### longest palindromic subs - dp solution

### Container most water
Two pointer, distance * common height, try to come close for more results

### 3sum


### 4 sum
Sort array
for num.length-3 
    skip duplicates
    for num.length-2
    skip duplicates
    left=j+1, r=n-1
    while(l<r) 
        sum=nums[i]+nums[j]+nums[l]+nums[r]
        if(sum==k) 
            res.add(....)
            skip duplicates for left and right
            l++ , r++
        else if(sum<k){
            l++
        else {
            r--}


