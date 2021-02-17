package com.zakcorp.final450.array;

import java.math.BigInteger;

/* Reverse the array */
public class P_22 {
    static class Solver {
        public BigInteger solve1(int m) {
            BigInteger fact = BigInteger.ONE;
            for(int i = 1; i <= m; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        }
    }
}
