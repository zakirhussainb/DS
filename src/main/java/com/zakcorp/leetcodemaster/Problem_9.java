package com.zakcorp.leetcodemaster;

public class Problem_9 {
    static class Solver {
        public boolean solve1(int x) {
            String str = Integer.toString(x);
            int i = 0; int j = str.length() - 1;
            while(i <= j) {
                if ( str.charAt(i) == str.charAt(j) ) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
            return true;
        }
        public boolean solve2(int x) {
            if(x < 0) {
                return false;
            }
            int num = x;
            int rev = 0;
            while(num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            return x == rev;
        }
    }
}
