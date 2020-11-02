package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_147_Test {
    Problem_147.Solver p = new Problem_147.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 6, 11, 12, 13}, p.solve2(new int[]{12, 11, 13, 5, 6}));
    }
}
