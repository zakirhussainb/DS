package com.zakcorp.hackerrank.problemsolving;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciModified {
    static class Solver {
        public BigInteger solve1(int t1, int t2, int n) {
            BigInteger b1 = BigInteger.valueOf(t1);
            BigInteger b2 = BigInteger.valueOf(t2);
            BigInteger n1 = BigInteger.valueOf(n);
            BigInteger[] memo = new BigInteger[n1.intValue() + 1];
            return fib(b1, b2, n1, memo);
        }
        private BigInteger fib(BigInteger b1, BigInteger b2, BigInteger n, BigInteger[] memo) {
            if( memo[n.intValue()] != null ) {
                return memo[n.intValue()];
            }
            if(BigInteger.ONE.equals(n))
                return b1;
            if(BigInteger.TWO.equals(n))
                return b2;
            memo[n.intValue()] = fib(b1, b2, n.subtract(BigInteger.valueOf(2)), memo).add(
                    fib(b1, b2, n.subtract(BigInteger.ONE), memo).multiply( fib(b1, b2, n.subtract(BigInteger.ONE), memo) ));
            return memo[n.intValue()];
        }
    }
}
