package com.zakcorp.final450.dp;

public class P_381 {
    /*
    Binomial Coefficient
        Formula:-  nCr = n! / r!(n - r)!
        Example:-  3C2 = 3! / 2!(3 - 2)! = 3;;
        Recurrence
        Relation:- comb(n - 1, k) + k * comb(n - 1, k - 1)
     */
    static class Solver {
        // Tabulation - DP - O(N) and O(N)
        public int solve3(int n, int r) {
            int[] factDp = new int[n + 1];
            factDp[0] = 1;
            for(int i = 1; i <= n; i++) {
                factDp[i] = i * factDp[i - 1];
            }
            int nF = factDp[n];
            int nrF = factDp[n - r];
            int rF = factDp[r];
            return nF / (rF * nrF);
        }

        // Without Tabulation - DP - O(N) and O(1)
        public int solve4(int n, int r) {
            int nF = 1, nrF = 1, rF  = 1;
            for(int i = 1; i <= n; i++) {
                nF = i * nF;
                if(i == n - r)
                    nrF = nF;
                if(i == r)
                    rF = nF;
            }
            return nF / (rF * nrF);
        }
    }
}
