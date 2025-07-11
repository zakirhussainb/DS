package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_3160_Test {
    Problem_3160.Solver p = new Problem_3160.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,1,2,1}, p.solve1(1, new int[][]{{0,1},{1,4},{1,1},{1,4},{1,1}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,2,3}, p.solve1(4, new int[][]{{1,4},{2,5},{1,3},{3,4}}));
    }
}
