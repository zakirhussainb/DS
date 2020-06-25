package com.zakcorp.leetcodemaster;

public class Problem_744 {
    static class Solver {
        public char nextGreatestLetter(char[] letters, char target) {
            for (char letter : letters) {
                if (letter > target) {
                    return letter;
                }
            }
            return letters[0];
        }
    }
}
