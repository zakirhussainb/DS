### When to make notes

- Data Structures

  - Definition
  - Operations
  - Sample Code / Implementation
  - For e.g. Segment Tree, Queue, Linked List, Tree, Graph, HashMap, etc.

- Algorithms/Classical Questions

  - Logic
  - Code/Pseudocode
  - Tips & Tricks
  - Complexity

#### Where to make notes

- Notebook
  - Everything in notebook
  - Separate notebook for each topic, arrays, linkedlist,
- Mix
  - Note(Theory) + Laptop(Code)
- Laptop

#### How to make notes?

- Logic
  - Formula
  - Diagrams
  - Pseudocode
  - Special Note
    - 2ptr approach
    - Greedy
  - Pattern - noticing the no. of times this approach is repeating.
  - What type of DS/Algo we have used?
  - Why have we used that?
- Only function or pseudocode
  - take notes only for main functions and not for helper functions.
- Time and Space Complexity
- Contest Problems, Practice Problems and Interview Problems, mention this when you approach your interviews and get asked about it.
- Revise from same notes.
- Leave 2 to 3 pages after each concept.

### Greedy

#### Problem #1

##### Minimum number of coins

- **Question**: Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
  Find the minimum number of coins and/or notes needed to make the change for Rs N. You must return the list containing the value of coins required.

- **Approach**:

  1.  **Initialization**:

      - Define an array `coins` containing all available denominations in ascending order: `{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000}`.
      - Initialize an empty list `res` to store the coins/notes that make up the target amount `N`.

  2.  **Iterate Through Denominations (Greedy Choice)**:

      - Start iterating through the `coins` array from the largest denomination to the smallest (i.e., from `coins[m-1]` down to `coins[0]`, where `m` is the number of denominations). This is the core of the greedy strategy: always try to use the largest possible denomination first.

  3.  **Select Coins of Current Denomination**:

      - For the current denomination `coins[i]`:
        - Calculate how many times this coin/note can be used to make change for the remaining amount `N` without exceeding it. This is done by integer division: `x = N / coins[i]`.
        - If `x` is greater than 0, it means the current denomination can be used.
        - Add the current denomination `coins[i]` to the `res` list `x` times. A `while` loop (`while(x > 0)`) is used for this.

  4.  **Update Remaining Amount**:

      - After using the current denomination as many times as possible, update the remaining amount `N` by taking the modulo: `N = N % coins[i]`. This gives the amount that still needs to be changed using smaller denominations.

  5.  **Repeat**:

      - Continue this process (steps 3 and 4) for all denominations, moving from largest to smallest.

  6.  **Result**:
      - Once the loop finishes (or `N` becomes 0), the `res` list will contain the coins/notes that sum up to the original target `N`, using the minimum number of items for this specific greedy strategy (which is optimal for canonical coin systems like Indian currency).
      - Return the `res` list.

- **Why this is Greedy**:

  - At each step, the algorithm makes a locally optimal choice (picking the largest possible denomination that is less than or equal to the remaining amount) hoping to reach a global optimum (minimum total number of coins).
  - For the standard Indian currency denominations (which is a canonical coin system), this greedy approach correctly provides the minimum number of coins.
  - **Important Note**: For arbitrary coin systems, a greedy approach might not always yield the optimal (minimum number of coins) solution. For example, if the denominations were `{1, 3, 4}` and the target amount `N` was `6`, a greedy approach would choose `4, 1, 1` (3 coins). However, the optimal solution is `3, 3` (2 coins).

- **Time and Space Complexity**:

  - **Time Complexity**: $O(K)$, where $K$ is the number of coins in the result.
    - The outer loop runs a fixed number of times (10, the number of denominations, which is a constant $D$).
    - The inner `while` loop runs $c_i$ times for each denomination `coins[i]`, where $c_i$ is the count of that coin in the result.
    - The total number of additions to the `res` list is $K = \sum c_i$.
    - So, the total operations are roughly proportional to $D + K$. Since $D$ is constant, this simplifies to $O(K)$.
    - In the worst-case scenario (e.g., if `N` is made up entirely of Re. 1 coins, if other denominations were absent), $K$ could be equal to `N`. Thus, a loose upper bound often cited is $O(N)$ (where $N$ is the target amount).
  - **Space Complexity**: $O(K)$, where $K$ is the number of coins in the result.
    - The primary space usage comes from the `res` list, which stores the $K$ coins.
    - The `coins` array uses $O(D)$ space, which is $O(1)$ as $D$ is constant.
    - Other variables use $O(1)$ space.
    - In the worst case, if $K=N$ (e.g., $N$ is paid using only Rs. 1 coins), the space complexity becomes $O(N)$.

- **Problem Link**:- https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1

- **Code**:

```java
import java.util.ArrayList;
import java.util.List;

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
