package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Subsequence1_Test
{
    private Subsequence1.Solver s1 = new Subsequence1.Solver();
    @Test
    public void test1() {
        assertTrue(s1.checkSubsequenceSum(new int[]{1, 2, 3, 4, 5}, 8));
    }
}
