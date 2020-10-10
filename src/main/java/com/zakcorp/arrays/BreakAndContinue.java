package com.zakcorp.arrays;

public class BreakAndContinue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = -10; i <= 2; ++i) {
            if (i < 0.0) {
                continue;
            }
            sum += i; // sum = sum + number;
        }
        System.out.println(sum);
    }
}
