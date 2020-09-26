package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_977_Test {
    Problem_977.Solver p = new Problem_977.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0,1,9,16,100}, p.solve1(new int[]{-4,-1,0,3,10}));
        assertArrayEquals(new int[]{0,1,9,16,100}, p.solve2(new int[]{-4,-1,0,3,10}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{4,9,9,49,121}, p.solve1(new int[]{-7,-3,2,3,11}));
        assertArrayEquals(new int[]{4,9,9,49,121}, p.solve2(new int[]{-7,-3,2,3,11}));
    }
}
