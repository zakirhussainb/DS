package com.zakcorp.leetcodemaster;

// Solution Reference : https://youtu.be/l0YC3876qxg
public class Problem_1922 {
    static class Solver {
        private static final long MOD = 1000_000_007;
        public int solve1(long n) {
            long e = (n + 1) / 2;
            long o = n / 2;
            return (int) (quickMul(5L, e) * quickMul(4L, o) % MOD);
        }

        private long quickMul(long base, long exponent) {
            long res = 1;
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    res = (res * base) % MOD;
                    exponent = exponent - 1;
                } else {
                    base = (base * base) % MOD;
                    exponent = exponent / 2;
                }
            }

            return res;
        }
    }

    static class Solver1 {
        private static final long MOD = 1000_000_007;
        public int solve1(long n) {
            long e = (n + 1) / 2;
            long o = n / 2;
            return (int) (quickMul(5L, e, new long[]{1L}) * quickMul(4L, o, new long[]{1L}) % MOD);
        }

        private long quickMul(long base, long exponent, long[] ans) {
            if(exponent < 1) {
                return ans[0];
            }
            if(exponent % 2 == 1) {
                ans[0] = (ans[0] * base) % MOD;
                exponent = exponent - 1;
            } else {
                base = (base * base) % MOD;
                exponent = exponent / 2;
            }
            return quickMul(base, exponent, ans);
        }
    }
}
