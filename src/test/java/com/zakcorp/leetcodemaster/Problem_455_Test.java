package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_455_Test {
    Problem_455.Solver p = new Problem_455.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,2,3}, new int[]{1, 1}));
        assertEquals(1, p.solve2(new int[]{1,2,3}, new int[]{1, 1}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1,2}, new int[]{1, 2, 3}));
        assertEquals(2, p.solve2(new int[]{1,2}, new int[]{1, 2, 3}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[]{5}, new int[]{1, 4, 3, 2}));
        assertEquals(0, p.solve2(new int[]{5}, new int[]{1, 4, 3, 2}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{5}, new int[]{1, 4, 3, 2, 5}));
        assertEquals(1, p.solve2(new int[]{5}, new int[]{1, 4, 3, 2, 5}));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1(new int[]{5}, new int[]{1, 4, 3, 2, 2147483647}));
        assertEquals(1, p.solve2(new int[]{5}, new int[]{1, 4, 3, 2, 2147483647}));
    }
    @Test
    public void test6() {
        assertEquals(1, p.solve1(new int[]{1,2,3}, new int[]{3}));
        assertEquals(1, p.solve2(new int[]{1,2,3}, new int[]{3}));
    }
    @Test
    public void test7() {
        assertEquals(2, p.solve1(new int[]{3,3,3}, new int[]{3,3}));
        assertEquals(2, p.solve2(new int[]{3,3,3}, new int[]{3,3}));
    }
}
