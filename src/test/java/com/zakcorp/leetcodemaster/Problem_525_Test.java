package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_525_Test {
    @Test
    public void test1() {
        Problem_525.Solver p = new Problem_525.Solver();
        assertEquals(2, p.findMaxLength(new int[]{0, 1}));
    }
}
