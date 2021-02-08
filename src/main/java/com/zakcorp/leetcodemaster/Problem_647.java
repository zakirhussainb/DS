package com.zakcorp.leetcodemaster;

public class Problem_647 {
    static class Solver {
        public int solve1(String str) {
            int c = 0;
            int n = str.length();
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    // System.out.println("i..." + i + "....j...." + j);
                    if( isPalindrome( str.substring(i, j) ) ) {
                        c++;
                    }
                }
            }
            return c;
        }
        private boolean isPalindrome(String str) {
            if(str.length() == 0 || str.length() == 1) {
                return true;
            }
            int left = 0, right = str.length() - 1;
            while(left <= right) {
                char leftCh = str.charAt(left);
                char rightCh = str.charAt(right);
                if(leftCh != rightCh) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
    static class Solver1 {

    }
}
