package com.zakcorp.leetcodemaster;

public class Problem_344 {
    static class Solver {
        public char[] reverseString(char[] s) {
            int n = s.length;
            int low = 0;
            int high = n - 1;
            while(low < high) {
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
                low++;
                high--;
            }
            return s;
        }
    }

}
