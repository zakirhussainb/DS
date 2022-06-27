package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve1(int N) {
            if (N == 1)
                return 4;

            int mod = 1_000_000_007;
            int countB=1, countS=1, prev_countB, prev_countS;

            for (int i = 2; i <= N; i++)
            {
                prev_countB = countB;
                prev_countS = countS;

//                countS = (prev_countB + prev_countS) % mod;
                countS = ( (prev_countB % mod) + (prev_countS % mod) ) % mod;
                countB = prev_countS;
            }

//            int result = ( (countS % mod) + (countB % mod) ) % mod;
            long result = ( countS + countB ) % mod;

            return (int)( (result % mod) * (result % mod) ) % mod;

//            return ( result * result ) % mod;
        }
    }
    static class Solver1 {
        public int solve1(int n) {
            /*if(n == 0)return 1;
            else if(n == 1)return 2;
            else
            {
                int dp[2][n+1];
                dp[0] = 1;
                dp[1] = 2;
                for(int i = 2; i < n + 1; i++)
                {
                    dp[i] = dp[i-1]+dp[i-2];
                }
                return (Math.pow(dp[n],2));
            }*/
            return 0;
        }
    }
}
