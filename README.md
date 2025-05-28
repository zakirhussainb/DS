# Assign Mice to Holes Problem

## Problem Description

Given `N` mice and `N` holes, both located on a straight line. Each hole can accommodate only one mouse. A mouse can move one step right ($x \to x + 1$) or one step left ($x \to x - 1$), or stay at its current position. Each move consumes 1 minute. The objective is to assign each mouse to a unique hole such that the time when the last mouse gets inside a hole is **minimized**.

**Note:** Arrays `M` and `H` represent the positions of the `N` mice and holes, respectively.

### Examples:

#### Example 1:
* **Input:**
  * `N = 3`
  * `M = {4, -4, 2}`
  * `H = {4, 0, 5}`
* **Output:** `4`
* **Explanation:**
  If we assign the mouse at the 1st index (`M[0]=4`) to the hole at the 1st index (`H[0]=4`), the mouse at the 2nd index (`M[1]=-4`) to the hole at the 2nd index (`H[1]=0`), and the third mouse (`M[2]=2`) to the third hole (`H[2]=5`), then the maximum time taken will be by the 2nd mouse: $|-4 - 0| = 4$ minutes.

#### Example 2:
* **Input:**
  * `N = 2`
  * `M = {4, 2}`
  * `H = {1, 7}`
* **Output:** `3`
* **Explanation:**
  If we assign the mouse at the 1st index (`M[0]=4`) to the hole at the 2nd index (`H[1]=7`), and the mouse at the 2nd index (`M[1]=2`) to the hole at the 1st index (`H[0]=1`), the maximum time taken will be by the 1st mouse: $|4 - 7| = 3$ minutes.

### Constraints:

* $1 \le N \le 10^5$
* $-10^5 \le M[i], H[i] \le 10^5$