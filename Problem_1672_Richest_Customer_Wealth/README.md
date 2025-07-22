# LeetCode 1672 - Richest Customer Wealth

## Intuition
The problem asks for the maximum wealth of any customer, where each customer's wealth is the sum of their money across all their bank accounts. My initial thought was to iterate through each customer’s accounts, calculate the total wealth for each customer by summing the amounts in their banks, and keep track of the highest wealth encountered.

## Approach
1. **Initialize Maximum Wealth**: Create a variable `highest` to store the maximum wealth, initially set to 0.
2. **Iterate Through Customers**: Use a loop to iterate through each customer (row `i` in the `accounts` array).
3. **Calculate Customer Wealth**: For each customer, use a nested loop to iterate through their bank accounts (elements in `accounts[i]`). Sum the amounts in a temporary variable `temp`.
4. **Update Maximum Wealth**: After calculating a customer’s wealth, compare `temp` with `highest`. If `temp` is greater than or equal to `highest`, update `highest` to `temp`.
5. **Return Result**: After processing all customers, return `highest` as the maximum wealth.

For example, if `accounts = [[1,2,3],[3,2,1]]`:
- For customer 0: `temp = 1 + 2 + 3 = 6`, update `highest = 6`.
- For customer 1: `temp = 3 + 2 + 1 = 6`, `highest` remains 6.
- Return `highest = 6`.

## Complexity
- **Time complexity**: `O(n * m)`
  - Here, `n` is the number of customers (rows in `accounts`), and `m` is the number of banks (columns in `accounts[i]`). The outer loop runs `n` times, and the inner loop runs `m` times for each customer, leading to a total of `n * m` operations.
- **Space complexity**: `O(1)`
  - Only a constant amount of extra space is used for the `highest` and `temp` variables, regardless of the input size.

## Analysis by Grok AI