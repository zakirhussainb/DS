package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_88_Test {
    Problem_88.Solver p = new Problem_88.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1}, p.solve1(new int[]{0}, 0, new int[]{1}, 1));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,2,3,5,6}, p.solve1(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3));
    }
}
