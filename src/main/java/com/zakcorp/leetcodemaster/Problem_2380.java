package com.zakcorp.leetcodemaster;

public class Problem_2380
{
    // TODO : DP solution is there pls do it.
    static class Solver {
        public int solve1(String s) {
            int[] res = {0};
            recursive(s, res);
            return res[0];
        }
        private void recursive(String s, int[] res) {
            if(!s.contains("01"))
                return;
            s = s.replaceAll( "01", "10" );
            res[0]++;
            recursive( s, res );
        }
    }

    static class Solver1 {
        public int solve1(String s) {
            int m = 0;
            while(s.contains( "01" )) {
                s = s.replaceAll( "01", "10" );
                m++;
            }
            return m;
        }
    }
}
