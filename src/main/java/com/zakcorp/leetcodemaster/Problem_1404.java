package com.zakcorp.leetcodemaster;

import java.math.BigInteger;

public class Problem_1404 {
    static class Solver {
        public int numSteps(String str) {
            BigInteger num = getDecimalNumber(str);
            int steps = 0;
            return getStepsCount(num, steps);
        }
        public int getStepsCount(BigInteger num, int steps) {
            if(num.equals(BigInteger.ONE))
                return steps;
            num = (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) ? num.divide(BigInteger.TWO) : num.add(BigInteger.ONE);
            return getStepsCount(num, steps + 1);
        }
        public BigInteger getDecimalNumber(String str) {
            char[] chArr = str.toCharArray();
            BigInteger num = BigInteger.ZERO;
            int k = 0;
            for(int i = chArr.length - 1; i >= 0; i--) {
                BigInteger a = new BigInteger(String.valueOf(Character.getNumericValue(chArr[i])));
                num = num.add(a.multiply(BigInteger.TWO.pow(k++)));
            }
            return num;
        }
    }
}
