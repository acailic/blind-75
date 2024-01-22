# Backtracking
### Combination sum 3 
- create result list and call backtrack function
- Backtrack fucntion:  
  func(result, currentList, numberOfElements, remain , start)
  if size of allowed list > numberOfElements return
- if size = numberOfElements and remain == 0 add to result
- for i in range(start, 10)
  - add i to currentList
  - backtrack(result, currentList, numberOfElements, remain - i, i + 1)
  - remove i from currentList
- // why temp list remove last element ? 
- // because we need to try all possible combinations
- // if we don't remove last element we will have duplicates