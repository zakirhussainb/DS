package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_122_Test {
    @Test
    public void test1() {
        Problem_122.Solver p = new Problem_122.Solver();
        assertEquals(7, p.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4, p.maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(0, p.maxProfit(new int[]{7,6,4,3,1}));
    }
}
