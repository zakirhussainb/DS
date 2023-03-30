package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_31_Test
{
    Problem_31.Solver p = new Problem_31.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3, 2}, p.solve1(new int[]{1, 2, 3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3}, p.solve1(new int[]{3, 2, 1}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 5, 1}, p.solve1(new int[]{1, 1, 5}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{1, 2, 3}, p.solve1(new int[]{3, 2, 1}));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{2, 1, 3}, p.solve1(new int[]{1, 3, 2}));
    }
}
