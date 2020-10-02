package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_75_Test {
    Problem_75.Solver p = new Problem_75.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0,0,1,1,2,2}, p.solve1(new int[]{2,0,2,1,1,0}));
        assertArrayEquals(new int[]{0,0,1,1,2,2}, p.solve2(new int[]{2,0,2,1,1,0}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0,1,2}, p.solve1(new int[]{2,0,1}));
        assertArrayEquals(new int[]{0,1,2}, p.solve2(new int[]{2,0,1}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{0}, p.solve1(new int[]{0}));
        assertArrayEquals(new int[]{0}, p.solve2(new int[]{0}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{1}, p.solve1(new int[]{1}));
        assertArrayEquals(new int[]{1}, p.solve2(new int[]{1}));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{0,1,2}, p.solve1(new int[]{0,2,1}));
        assertArrayEquals(new int[]{0,1,2}, p.solve2(new int[]{0,2,1}));
    }
    @Test
    public void test6() {
        assertArrayEquals(new int[]{0,1,2}, p.solve1(new int[]{0,2,1}));
        assertArrayEquals(new int[]{0,1,2}, p.solve2(new int[]{0,2,1}));
    }
}
