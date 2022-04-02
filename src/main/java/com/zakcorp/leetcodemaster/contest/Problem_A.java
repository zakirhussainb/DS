package com.zakcorp.leetcodemaster.contest;


public class Problem_A {
    static class Solver {
        public int solve1(int start, int goal) {
            String str = Integer.toBinaryString(start);
            String goa = Integer.toBinaryString(goal);
            int c = 0;
            int i = str.length() - 1, j = goa.length() - 1;
            while(i >= 0 && j >= 0) {
                if(str.charAt(i) != goa.charAt(j)) {
                    c++;
                }
                i--;
                j--;
            }
            while(i >= 0) {
                if(str.charAt(i) != '0') {
                    c++;
                }
                i--;
            }
            while(j >= 0) {
                if(goa.charAt(j) != '0') {
                    c++;
                }
                j--;
            }
            return c;
        }
    }
}
