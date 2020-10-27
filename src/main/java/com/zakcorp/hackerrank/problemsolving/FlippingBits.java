package com.zakcorp.hackerrank.problemsolving;

/**
 * Created by Zakir Hussain B on 26/10/20.
 *
 * @source: Hackerrank
 * @topic: Algorithms
 * @sub-topic: Bit Manipulation
 * @platform: Hackerrank
 * @problem_link: https://www.hackerrank.com/challenges/flipping-bits/problem
 * @pseudocode:
 */
public class FlippingBits {
    // Complete the flippingBits function below.
    public long flippingBits(long n) {
        return (1L << 32) - 1 - n;
    }
    /*// Complete the flippingBits function below.
    static long flippingBits(long n) {
        long val = (long)Math.pow(2, 32) - 1;
        return val - n;
    }*/
}