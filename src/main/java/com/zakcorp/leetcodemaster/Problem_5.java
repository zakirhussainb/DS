package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_5 {
    // Good Solution but only Brute Force -> Got Time Limit Exceeded -> https://leetcode.com/submissions/detail/436771337/
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            String maxStr = "";
            int maxLen = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    String m = str.substring(i, j + 1);
                    if( !m.isEmpty() && isPalindrome(m) ) {
                        if(m.length() > maxLen) {
                            maxLen = m.length();
                            maxStr = m;
                        }
                    }
                }
            }
            return maxStr;
        }
        private boolean isPalindrome(String str) {
            int l = 0, h = str.length() - 1;
            while(l <= h) {
                if(str.charAt(l) != str.charAt(h)) {
                    return false;
                } else {
                    l++;
                    h--;
                }
            }
            return true;
        }
    }

    // Good Solution but only Brute Force -> Got Memory Limit Exceeded -> https://leetcode.com/submissions/detail/436770127/
    // Memory exceeded because of PriorityQueue
    static class Solver1 {
        static class Pair {
            String str;
            int len;
            public Pair(String str, int len) {
                this.str = str;
                this.len = len;
            }
        }
        public String solve1(String str) {
            int n = str.length();
            PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> b.len - a.len );
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    String m = str.substring(i, j + 1);
                    if( !m.isEmpty() && isPalindrome(m) ) {
                        pq.add(new Pair(m, m.length()));
                    }
                }
            }
            return Objects.requireNonNull(pq.poll()).str;
        }
        private boolean isPalindrome(String str) {
            int l = 0, h = str.length() - 1;
            while(l <= h) {
                if(str.charAt(l) != str.charAt(h)) {
                    return false;
                } else {
                    l++;
                    h--;
                }
            }
            return true;
        }
    }
}
