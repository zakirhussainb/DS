package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_912_Test {
    Problem_912.Solver p = new Problem_912.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 5}, p.solve1(new int[]{5,2,3,1}));
    }
}
