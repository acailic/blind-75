# String
### Palindrome
for two pointers, move them and check are character are matching.
### Pararentheses
### Longest Substring without Repeating Characters
- Create map of character and position, for end loop , each character check is in map. if it is start is last position of charachter plus 1.
add char to map. compute max, from end-start+1.
### Longest Charachter Replacment
Create a map counter for charachters. for each end char count plus one in map and also get repeted counter.
if its over k -> move start, and remove one for start char. else check max for end-start+1
ƒ