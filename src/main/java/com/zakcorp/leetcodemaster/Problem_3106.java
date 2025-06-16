package com.zakcorp.leetcodemaster;

public class Problem_3106
{
    static class Solver {
        public String solve1(String s, int k) {
            StringBuilder ans = new StringBuilder();

            // If k is 0, no changes can be made, so return the original string.
            if (k == 0) {
                return s;
            }

            // Iterate through each character of the string from left to right.
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                // If we have no budget left, we can't make any more changes.
                // Just append the original character.
                if (k == 0) {
                    ans.append(ch);
                    continue;
                }

                // --- This is the core of the Greedy choice ---

                // Calculate the cost to change the current character 'ch' to 'a'.
                // There are two ways in a cycle: moving down ('c' -> 'b' -> 'a')
                // or moving up and wrapping around ('y' -> 'z' -> 'a').
                int distDown = ch - 'a';
                int distUp = ('z' - ch) + 1;
                int cost_to_a = Math.min(distDown, distUp);

                // Case 1: We have enough budget to change the character to 'a'.
                // This is the best possible move for the current position.
                if (k >= cost_to_a) {
                    ans.append('a');
                    k -= cost_to_a; // Spend the required budget.
                }
                // Case 2: We don't have enough budget to reach 'a'.
                // Use all our remaining budget to make the character as small as possible.
                // The cheapest way to reduce a character's value is by moving it down.
                else {
                    char newChar = (char) (ch - k);
                    ans.append(newChar);
                    k = 0; // All budget is now used up.
                }
            }
            return ans.toString();
        }
    }
}
