package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1817_Test
{
    Problem_1817.Solver p = new Problem_1817.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0,2,0,0,0}, p.solve1(new int[][]{{0,5},{1,2},{0,2},{0,5},{1,3}}, 5));
        assertArrayEquals(new int[]{0,2,0,0,0}, p.solve2(new int[][]{{0,5},{1,2},{0,2},{0,5},{1,3}}, 5));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,1,0,0}, p.solve1(new int[][]{{1,1},{2,2},{2,3}}, 4));
        assertArrayEquals(new int[]{1,1,0,0}, p.solve2(new int[][]{{1,1},{2,2},{2,3}}, 4));
    }
}
