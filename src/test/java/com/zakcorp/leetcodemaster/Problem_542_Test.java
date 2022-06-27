package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_542_Test {
    Problem_542.Solver p = new Problem_542.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{0,0,0}},
                p.solve1(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{1,2,1}},
                p.solve1(new int[][]{{0,0,0},{0,1,0},{1,1,1}}));
    }
}
