package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_2559_Test {
    Problem_2559.Solver p = new Problem_2559.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,3,0}, p.solve1(new String[]{"aba","bcb","ece","aa","e"}, new int[][]{{0,2},{1,4},{1,1}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3,2,1}, p.solve1(new String[]{"a","e","i"}, new int[][]{{0,2},{0,1},{2,2}}));
    }
}
