# LeetCode 594 - Longest Harmonious Subsequence

## Intuition
The problem requires finding the length of the longest harmonious subsequence, where a harmonious subsequence is a sequence of numbers with a difference of exactly 1 between the maximum and minimum values. My initial thought was to identify numbers in the array that have at least one other number differing by exactly 1 (either `nums[i] + 1` or `nums[i] - 1`). Then, for each such number, I would gather all occurrences of that number and its counterpart to form subsequences and determine the longest one.

## Approach
1. **Identify Harmonious Elements**: Iterate through the array to check each number and determine if it has at least one other number differing by exactly 1. Store this information in an `ArrayList` (`LHSList`), where a value of 1 indicates the number at that index is part of a potential harmonious subsequence.
2. **Build Subsequences**: For each index where `LHSList.get(x) == 1`, create a temporary `ArrayList` (`tempList`) to collect numbers. Add the number at the current index (`nums[x]`). Then, iterate through the array again to:
   - Collect all occurrences of `nums[x]`.
   - Find the first occurrence of a number that is `nums[x] + 1` (lock this as `lockedValue`).
   - Collect all subsequent occurrences of `lockedValue` or `nums[x]`.
   Store each subsequence in an `ArrayList` of `ArrayList`s (`results`).
3. **Find Longest Subsequence**: Iterate through the subsequences in `results` to find the one with the maximum length. Return this length as the result.

## Complexity
- **Time complexity**: `O(n^2)`
  - The first loop to identify harmonious elements takes `O(n^2)` as we check the entire array for each element to find a number differing by 1.
  - The second loop to build subsequences also takes `O(n^2)` as we iterate through the array for each valid index to collect matching numbers.
  - The final loop to find the longest subsequence takes `O(n)`, but it is dominated by the earlier `O(n^2)` operations.
- **Space complexity**: `O(n)`
  - `LHSList` stores `n` integers to mark harmonious elements.
  - The `results` `ArrayList` stores subsequences, where each subsequence contains at most `n` elements, but the total space is proportional to `n` in the worst case.
  - The temporary `tempList` for building each subsequence is also bounded by `n`.

## Analysis by Grok AI