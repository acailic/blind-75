# Dynamic programming
### LongestIncreaseSequence
-- from backwards, check from last one can we use it 
Init dp[n], all 1, for each element in inner loop if nums[i]>nums[j] 
dp[i]=Math.max(dp[j]+1,dp[i])
max of max or dp[i]
--- another solution
binary search with tails nlogn
-- 
### Climbing stairs
Up to n, 2 or 1 step so dp[i]=dp[i-2]+dp[i-1], dp[n]
### Combination sum
Backtracking problem,
go through combinations back, to get to target. add in combination, remove last one
other one dp like stairs to get to target
for all values until target, go through nums to check how it can get to 
dp[i]+=dp[i-num];
### House robber 
Init first values. Pick from two houses which to rob. move vars and return prevOne.
### Word break

### [LongestSubsequenceSum.java](LongestSubsequenceSum.java)[LongestSubsequenceSum.java](LongestSubsequenceSum.java)
