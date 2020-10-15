package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_41_Test {
    Problem_41.Solver p = new Problem_41.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{1, 2, 0}));
        assertEquals(3, p.solve2(new int[]{1, 2, 0}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{3, 4, -1, 1}));
        assertEquals(2, p.solve2(new int[]{3, 4, -1, 1}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{7, 8, 9, 11, 12}));
        assertEquals(1, p.solve2(new int[]{7, 8, 9, 11, 12}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{0, -1, -4, -3, -5}));
        assertEquals(1, p.solve2(new int[]{0, -1, -4, -3, -5}));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1(new int[]{-1, -2, -4, -3, -5}));
        assertEquals(1, p.solve2(new int[]{-1, -2, -4, -3, -5}));
    }
    @Test
    public void test6() {
        assertEquals(2, p.solve1(new int[]{-99,-98,-97,-96,0,1}));
        assertEquals(2, p.solve2(new int[]{-99,-98,-97,-96,0,1}));
    }
    @Test
    public void test7() {
        assertEquals(1, p.solve1(new int[]{}));
        assertEquals(1, p.solve2(new int[]{}));
    }
    @Test
    public void test8() {
        assertEquals(1, p.solve1(new int[]{2147483647}));
        assertEquals(1, p.solve2(new int[]{2147483647}));
    }
    @Test
    public void test9() {
        assertEquals(1, p.solve1(new int[]{-5}));
        assertEquals(1, p.solve2(new int[]{-5}));
    }
    @Test
    public void test10() {
        assertEquals(4, p.solve1(new int[]{1,2,3,10,2147483647,9}));
        assertEquals(4, p.solve2(new int[]{1,2,3,10,2147483647,9}));
    }
}
