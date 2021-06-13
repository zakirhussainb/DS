package com.zakcorp.final450.dp;

public class P_382 {
    /*
    Permutation Coefficient
        Formula:-  nPr = n! / (n - r)!
        Example:-  3P2 = 3! / (3 - 2)! = 6;;
        Recurrence
        Relation:- perm(n - 1, k) + k * perm(n - 1, k - 1)
     */
    static class Solver {
        private static int mod = 1_000_000_007;
        // recursive solution
        public int solve1(int n, int r) {
            if(r > n)
                return 0;
            if(r == 0)
                return 1;
            return solve1(n - 1, r) + r * solve1(n - 1, r - 1);
        }

        //TODO: Memoized sol is not working - Need to work on it
        public int solve2(int n, int r) {
            int[] memo = new int[n + 1];
            return memoized(n, r, memo);
        }

        private int memoized(int n, int r, int[] memo) {
            if(memo[n] != 0) {
                return memo[n];
            }
            if(r > n) {
                memo[n] = 0;
                return 0;
            }
            if(r == 0) {
                memo[n] = 1;
                return 1;
            }
            int sol = memoized(n - 1, r, memo) + r * memoized(n - 1, r - 1, memo);
            memo[n] = sol;
            return sol;
        }

        // tabulation DP - O(N) and O(N)
        public long solve3(int n, int r) {
            long[] factDp = new long[n + 1];
            factDp[0] = 1;
            for(int i = 1; i <= n; i++) {
                factDp[i] = i * factDp[i - 1];
            }
            return factDp[n] / factDp[n - r];
        }

        // tabulation DP - O(N) and O(1)
        public long solve4(int n, int r) {
            long nFact = 1, nRFact = 1;
            for(int i = 1; i <= n; i++) {
                nFact = i * nFact;
                if(i == n - r)
                    nRFact = nFact;
            }
            return nFact / nRFact;
        }
    }
}
