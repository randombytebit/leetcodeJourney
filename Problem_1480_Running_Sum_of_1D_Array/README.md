# LeetCode 1480 - Running Sum of 1D Array

## Intuition
The problem requires computing the running sum of an array, where each element at index `i` in the result array is the sum of all elements in the input array from index `0` to `i`. My initial idea was to create a new array to store the results and, for each index `i`, sum all elements from the start of the input array up to that index. This led me to use a nested loop to accumulate the sums based on index positions.

## Approach
1. **Initialize Result Array**: Create a new array `result` with the same length as the input array `nums` to store the running sums.
2. **Set First Element**: Since the running sum at index `0` is just `nums[0]`, initialize `result[0]` with `nums[0]`.
3. **Compute Running Sums**: Use two nested loops:
   - The outer loop iterates from index `1` to `nums.length - 1`.
   - The inner loop, for each index `i`, sums all elements in `nums` from index `0` to `i-1` and stores the sum in `result[i]`.
4. **Return Result**: Return the `result` array containing the running sums.

For example, if `nums = [1, 2, 3, 4]`:
- At `i=0`: `result[0] = nums[0] = 1`
- At `i=1`: `result[1] = nums[0] + nums[1] = 1 + 2 = 3`
- At `i=2`: `result[2] = nums[0] + nums[1] + nums[2] = 1 + 2 + 3 = 6`
- At `i=3`: `result[3] = nums[0] + nums[1] + nums[2] + nums[3] = 1 + 2 + 3 + 4 = 10`

## Complexity
- **Time complexity**: `O(n^2)`
  - The outer loop runs `n-1` times, and for each iteration, the inner loop runs up to `i` times, where `i` ranges from 1 to `n-1`. This results in approximately `1 + 2 + ... + (n-1)` iterations, which is `O(n^2)`.
- **Space complexity**: `O(n)`
  - A new array `result` of length `n` is created to store the running sums.

## Remark - Comparison with LeetCode Solution
The LeetCode solution is more efficient:
- It modifies the input array `nums` in-place, where each element `nums[i]` is updated to `nums[i-1] + nums[i]` using a single loop.
- **Time Complexity**: `O(n)` (single loop iterating through the array once).
- **Space Complexity**: `O(1)` (no additional space beyond the input array, assuming the output can overwrite the input).

## Analysis by Grok AI