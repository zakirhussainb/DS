package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_684_Test {
    Problem_684.Solver p = new Problem_684.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 3}, p.findRedundantConnection(new int[][]{{1,2}, {1,3}, {2,3}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 4}, p.findRedundantConnection(new int[][]{{1,2}, {2,3}, {3,4}, {1,4}, {1,5}}));
    }
}
