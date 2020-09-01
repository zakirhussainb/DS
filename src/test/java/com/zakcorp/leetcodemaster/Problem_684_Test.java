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
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 3}, p.findRedundantConnection(new int[][]{{1,2}, {2,3}, {1,3}}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{4, 10}, p.findRedundantConnection(new int[][]{{9,10},{5,8},{2,6},{1,5},{3,8},{4,9},{8,10},{4,10},{6,8},{7,9}}));
    }
}