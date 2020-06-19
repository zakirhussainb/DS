package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_204_Test {
    Problem_204.Solver p = new Problem_204.Solver();

    @Test
    public void test1() {
        assertEquals(4, p.countPrimes(10));
    }
}
