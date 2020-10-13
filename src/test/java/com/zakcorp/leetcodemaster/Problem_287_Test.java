package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_287_Test {
    Problem_287.Solver p = new Problem_287.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1, 3, 4, 2, 2}));
        assertEquals(2, p.solve2(new int[]{1, 3, 4, 2, 2}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{3, 1, 3, 4, 2}));
        assertEquals(3, p.solve2(new int[]{3, 1, 3, 4, 2}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{1, 1}));
        assertEquals(1, p.solve2(new int[]{1, 1}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{1, 1, 2}));
        assertEquals(1, p.solve2(new int[]{1, 1, 2}));
    }
    @Test
    public void test6() {
        assertEquals(6, p.solve1(new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6}));
        assertEquals(6, p.solve2(new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6}));
    }
}
