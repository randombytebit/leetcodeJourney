# LeetCode 412 - Fizz Buzz

## Intuition
The problem requires generating a list of strings from 1 to `n`, where numbers divisible by 3 are replaced with "Fizz", numbers divisible by 5 are replaced with "Buzz", and numbers divisible by both 3 and 5 are replaced with "FizzBuzz". My initial thought was to create an ArrayList to store the results and iterate through the numbers from 1 to `n`, checking each number for divisibility conditions to determine the appropriate string output.

## Approach
1. **Initialize Result ArrayList**: Create an empty `ArrayList<String>` called `result` to store the output strings.
2. **Iterate Through Numbers**: Use a for loop to iterate from 1 to `n`.
3. **Check Divisibility Conditions**: For each number `i`:
   - If `i` is divisible by both 3 and 5 (i.e., `i % 3 == 0 && i % 5 == 0`), add "FizzBuzz" to `result`.
   - Else if `i` is divisible by 3 (i.e., `i % 3 == 0`), add "Fizz" to `result`.
   - Else if `i` is divisible by 5 (i.e., `i % 5 == 0`), add "Buzz" to `result`.
   - Otherwise, add the string representation of `i` to `result`.
4. **Return Result**: Return the `result` ArrayList containing the Fizz Buzz sequence.

For example, if `n = 5`, the output would be `["1", "2", "Fizz", "4", "Buzz"]`.

## Complexity
- **Time complexity**: `O(n)`
  - The solution uses a single for loop that iterates from 1 to `n`, performing constant-time operations (divisibility checks and string additions) for each iteration.
- **Space complexity**: `O(n)`
  - The `ArrayList<String> result` stores `n` strings, one for each number from 1 to `n`. Note that while the problem's output requires `O(n)` space, the space for temporary variables is `O(1)`.

## Analysis by Grok AI