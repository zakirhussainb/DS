package com.zakcorp.leetcodemaster;

// Solution Reference : https://youtu.be/l0YC3876qxg

public class Problem_50 { // Similar to 1922
    static class Solver {
        public double myPow(double x, int n) {
            double ans = 1.0;
            long nn = n;
            if(nn < 0) {
                nn = -nn;
            }
            while(nn > 0) {
                if(nn % 2 == 1) {
                    ans = ans * x;
                    nn = nn - 1;
                } else {
                    x = x * x;
                    nn = nn / 2;
                }
            }

            if(n < 0) {
                ans = 1 / ans;
            }
            return ans;
        }
    }

    static class Solver1 {
        public double power(double x, long nn, double[] ans) {
            if(nn < 1) {
                return ans[0];
            }
            if(nn % 2 == 1) {
                ans[0] = ans[0] * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
            return power(x, nn, ans);
        }
        public double myPow(double x, int n) {
            long nn = n;
            if(nn < 0) {
                nn = -nn;
            }
            double ans = power(x, nn, new double[]{1.0});
            if(n < 0) {
                ans = 1 / ans;
            }
            return ans;
        }
    }
}
