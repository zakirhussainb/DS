package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0) {
            BigInteger nonNegInt = new BigInteger(br.readLine());
            String binStr = nonNegInt.toString(2);
            printOddNumberOfZerosAndOnes_1(binStr);
        }
    }
    private static void printOddNumberOfZerosAndOnes_1(String binStr) {
        System.out.println(binStr);
        int n = binStr.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(binStr.substring(i, j));
            }
        }
    }
}
