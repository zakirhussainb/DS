package com.zakcorp.leetcodemaster;

public class Problem_1208
{
    static class Solver {
        public int solve1(String s, String t, int maxCost) {
            int start = 0;
            int end = 0;
            int maxLength = 0;
            int currCost = 0;
            while(end < s.length()) {
                int sCh = s.charAt( end ) - 'a';
                int tCh = t.charAt( end ) - 'a';
                currCost += Math.abs( sCh - tCh );
                while(currCost > maxCost) {
                    currCost -= Math.abs( s.charAt( start ) - t.charAt( start ) );
                    start++;
                }
                maxLength = Math.max( maxLength, end - start + 1 );
                end++;
            }
            return maxLength;
        }
    }
}
