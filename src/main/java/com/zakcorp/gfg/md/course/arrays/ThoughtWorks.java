package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class ThoughtWorks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0) {
            BigInteger nonNegInt = new BigInteger(br.readLine());
            String binStr = nonNegInt.toString(2);
            printOddNumberOfZerosAndOnes(binStr);
        }
    }
    private static void printOddNumberOfZerosAndOnes(String binStr) {
        int n = binStr.length();
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = binStr.substring(i, j);
                result1 = result1 + oddNumberOfValues(substring, "0");
                result2 = result2 + oddNumberOfValues(substring, "1");
            }
        }
        System.out.println(result1 + " " + result2);
    }
    private static int oddNumberOfValues(String str, String var) {
        int res = str.length() - str.replace(var, "").length();
        int result = 0;
        if(res % 2 != 0) {
            result++;
        }
        return result;
    }
}
