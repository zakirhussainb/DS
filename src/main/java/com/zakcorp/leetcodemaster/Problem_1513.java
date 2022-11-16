package com.zakcorp.leetcodemaster;

public class Problem_1513
{
    static class Solver {
        public int solve1(String str) {
            int ans = 0;
            int count = 0;
            int mod = 1000_000_007;
            for(int i = 0; i < str.length(); i++) {
                if( str.charAt( i ) == '1' ) {
                    count++;
                } else {
                    count = 0;
                }
                ans = (ans + count) % mod;
            }
            return ans;
        }
        public int solve2(String str) {
            int start = 0;
            int ans = 0;
            int mod = 1000_000_007;
            for(int end = 0; end < str.length(); end++) {
                if(str.charAt(end) == '1') {
                    ans += end - start + 1;
                } else {
                    start = end + 1;
                }
            }
            return (int)(ans % mod);
        }
    }
}
