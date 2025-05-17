### Greedy

#### #1 Minimum number of coins

- **Question**: Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
  Find the minimum number of coins and/or notes needed to make the change for Rs N. You must return the list containing the value of coins required.

- **Approach**:

  1.  **Initialization**:

      - Define a fixed array `coins` containing all available denominations in ascending order: `{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000}`.
      - Store the number of denominations in `m`.
      - Initialize an empty list `res` to store the coins/notes that make up the target amount `N`.

  2.  **Iterate Through Denominations (Greedy Choice)**:

      - Loop through the `coins` array starting from the largest denomination (`coins[m-1]`) down to the smallest (`coins[0]`).

  3.  **Repeatedly Select Current Denomination**:

      - For the current denomination `coins[i]`:
        - Enter a `while` loop that continues as long as the remaining amount `N` is greater than or equal to the current denomination `coins[i]`.
        - Inside the `while` loop:
          - Add the current denomination `coins[i]` to the `res` list.
          - Subtract the value of `coins[i]` from the remaining amount `N` (i.e., `N = N - coins[i]`).
        - This ensures that the current denomination is used as many times as possible before moving to a smaller one.

  4.  **Early Exit (Optimization)**:

      - After processing each denomination (i.e., after the inner `while` loop for `coins[i]` completes), check if the remaining amount `N` has become `0`.
      - If `N` is `0`, it means the exact change has been made, so we can `break` out of the outer loop as no more coins are needed.

  5.  **Result**:
      - Once the outer loop finishes (either by iterating through all denominations or by an early exit when `N` becomes `0`), return the `res` list. This list contains the denominations used to make change for the original target amount.

- **Time and Space Complexity**:

  - **Time Complexity**: $O(K)$, where $K$ is the number of coins in the final result list (worst case can be $O(N)$ if $N$ is the target amount and only 1-unit coins are used).
  - **Space Complexity**: $O(K)$, for storing the $K$ coins in the result list (worst case can be $O(N)$).

- **Why this is Greedy**:

  - At each step, the algorithm makes a locally optimal choice (picking the largest possible denomination that is less than or equal to the remaining amount) hoping to reach a global optimum (minimum total number of coins).
  - For the standard Indian currency denominations, this greedy approach works and provides the optimal solution.
  - However, it's important to note that for arbitrary coin systems, a greedy approach might not always yield the minimum number of coins. For e.g. {4, 3, 1} and target 6, the greedy approach would give 4+1+1, but the optimal solution is 3+3.

- **Code**:

```java
class Solution {
    static List<Integer> minPartition(int N) {
        int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int m = coins.length; // m = 10
        List<Integer> res = new ArrayList<>();

        // Iterate from the largest denomination to the smallest
        for(int i = m - 1; i >= 0; i--) {
            // While the current denomination can be used for the remaining amount N
            while(N >= coins[i]) {
                // Add the coin to the result
                res.add(coins[i]);
                // Reduce the amount N by the coin's value
                N -= coins[i];
            }
            // If N becomes 0, we have found the exact change, no need to check smaller denominations
            if (N == 0) {
                break;
            }
        }
        return res;
    }
}
```

- **Problem Link**:- [Minimum number of Coins](https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1)
- **Video Resource**:- [Greedy Algorithm From Basic To Advance](https://youtu.be/-wqKvpYGg1I)
