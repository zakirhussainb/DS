package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Subsequence2_Test
{
    private Subsequence2.Solver1 s2 = new Subsequence2.Solver1();
    @Test
    public void test1() {
        assertEquals(2, s2.countSubsequenceWithTargetSum(new int[]{4, 9, 2, 5, 1}, 10));
    }
}
