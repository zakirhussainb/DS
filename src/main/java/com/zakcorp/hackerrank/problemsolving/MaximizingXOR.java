package com.zakcorp.hackerrank.problemsolving;

import java.util.List;

/**
 * Created by Zakir Hussain B on 26/10/20.
 *
 * @source: Hackerrank
 * @topic: Algorithms
 * @sub-topic: Bit Manipulation
 * @platform: Hackerrank
 * @problem_link: https://www.hackerrank.com/challenges/maximizing-xor/problem
 * @pseudocode:
 */
public class MaximizingXOR {
    public int maximizingXor(int L, int R) {
        int xored = L ^ R;
        int leadingZeros = Integer.numberOfLeadingZeros(xored);
        int significantBit = 31 - leadingZeros;
        int result = (1 << (significantBit + 1)) - 1;
        return result;
    }
}