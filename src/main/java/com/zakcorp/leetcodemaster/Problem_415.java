package com.zakcorp.leetcodemaster;

import java.math.BigInteger;

public class Problem_415 {
    static class Solver {
        public String addStrings(String str1, String str2) {
            if(str1.isEmpty() && str2.isEmpty()) {
                return "";
            }
            BigInteger num1 = getIntegerOf(str1);
            BigInteger num2 = getIntegerOf(str2);
            BigInteger sum = num1.add(num2);
            return sum.compareTo(BigInteger.ZERO) <= 0 ? "0" : String.valueOf(sum);
        }

        private BigInteger getIntegerOf(String str) {
            int n = str.length();
            if(n == 0){
                return BigInteger.ZERO;
            }
            BigInteger sum = BigInteger.ZERO;
            for(int i = 0; i < n; i++) {
                sum = (sum.multiply(BigInteger.TEN)).add(BigInteger.valueOf(str.charAt(i) - '0'));
            }
            return sum;
        }
    }
    static class Solver1 {
        public String addStrings(String str1, String str2) {
            StringBuilder sb = new StringBuilder();
            int i = str1.length() - 1, j = str2.length() - 1;
            int carry = 0;
            while(i >= 0 || j >= 0) {
                int sum = carry;
                if(i >= 0) {
                    sum += str1.charAt(i--) - '0';
                }
                if(j >= 0) {
                    sum += str2.charAt(j--) - '0';
                }
                sb.append(sum % 10);
                carry = sum / 10;
            }
            if(carry != 0) {
                sb.append(carry);
            }
            return sb.reverse().toString();
        }
    }
}
