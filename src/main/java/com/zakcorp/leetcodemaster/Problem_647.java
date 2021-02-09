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
        public int solve1(String str) {
            int[] sum = {0};
            return recursive(0, 1, str, sum);
        }
        private int recursive(int i, int j, String str, int[] sum) {
            if(i >= str.length())
                return 0;
            if(j > str.length())
                return 0;
            String substr = str.substring(i, j);
            if( !substr.isEmpty() && isPalindrome( substr ) ) {
                sum[0] += 1;
            }
            return recursive(i, j + 1, str, sum) + recursive(i + 1, j, str, sum);
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
}
