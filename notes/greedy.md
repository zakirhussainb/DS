# 🪙 Problem #1: Minimum Number of Coins

## ✅ Problem Statement

Given an infinite supply of each denomination of Indian currency `{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000}` and a target value `N`, return a **list** of coin values that sum up to `N` using the **minimum number of coins/notes**.

---

## 🧠 Approach: Greedy Algorithm

### 🔍 Intuition

To minimize the number of coins:

- Use the **largest possible denomination** at each step.
- Subtract its value from `N`.
- Repeat until `N == 0`.

This is a classic **greedy** problem because:

- Locally optimal choices (choosing the biggest coin possible) lead to a globally optimal solution.

### 🪜 Steps

1. Initialize a list of denominations sorted in **ascending order**.
2. Iterate from the **largest denomination to smallest**.
3. While the current denomination can be used (`N >= denomination[i]`):
   - Add it to the result list.
   - Subtract its value from `N`.
4. Stop when `N == 0`.

---

## 🔁 Dry Run Example

Let’s say `N = 43`

- Start from 2000 → Skip
- ...
- Use 20 → N = 23 → res = [20]
- Use 20 → N = 3 → res = [20, 20]
- Use 2 → N = 1 → res = [20, 20, 2]
- Use 1 → N = 0 → res = [20, 20, 2, 1]

✅ Output: `[20, 20, 2, 1]`

---

## 🧾 Code (Java)

```java
class Solution {
    static List<Integer> minPartition(int N) {
        int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int m = coins.length;
        List<Integer> res = new ArrayList<>();

        for (int i = m - 1; i >= 0; i--) {
            while (N >= coins[i]) {
                res.add(coins[i]);
                N -= coins[i];
            }
            if (N == 0) break;
        }
        return res;
    }
}
```

### Greedy / Prefix Sum

#### #3 Minimum Levels Alice Should Play

- **Question**:  
  Alice and Bob are playing a game consisting of `n` levels. Each level is either possible (`1`) or impossible (`0`) to clear.

  - If a level is cleared (`1`), the player gains **+1 point**.
  - If a level is failed (`0`), the player loses **-1 point**.

  Alice starts the game and must play at least **1 level**, after which Bob plays the remaining levels (also at least 1 level).

  You need to find the **minimum number of levels Alice should play** (starting from index `0`) so that **Alice ends up with more points than Bob**, **assuming both play optimally**.

  If no such number of levels exists, return `-1`.

---

- **Approach**:

  This is a prefix sum–based greedy problem.

  #### ✅ Step-by-step Strategy:

  1. **Convert all level results into actual scores**:

     - Convert each `1` to `+1` (success), and each `0` to `-1` (failure).
     - Compute `totalSum` = total score across all levels.

  2. **Simulate Alice’s options**:

     - Iterate from level `0` to level `n - 2`:
       - (because Bob must play at least one level)
     - For each index `i`, calculate:

       - `aliceScore`: sum of points from level `0` to `i`.
       - `bobScore`: remaining sum = `totalSum - aliceScore`.

     - Check if `aliceScore > bobScore`. If yes, return `i + 1` (minimum levels Alice should play).

  3. **If no such prefix found**, return `-1`.

---

- **Time and Space Complexity**:

  - **Time Complexity**: `O(N)` — one pass to compute total sum, one pass to check prefix scores.
  - **Space Complexity**: `O(1)` — in-place transformation and prefix tracking.

---

- **Code (Java)**:

```java
class Solution {
    public int minimumLevels(int[] possible) {
        int ts = 0;
        int n = possible.length;

        // Convert 0 → -1 and calculate total score
        for (int i = 0; i < n; i++) {
            if (possible[i] == 0) {
                ts -= 1;
                possible[i] = -1;
            } else {
                ts += 1;
            }
        }

        int aliceScore = 0;
        int levelsPlayed = 0;

        for (int i = 0; i < n - 1; i++) {
            aliceScore += possible[i];
            levelsPlayed++;

            int bobScore = ts - aliceScore;

            if (aliceScore > bobScore) {
                return levelsPlayed; // i + 1
            }
        }

        return -1;
    }
}
```
