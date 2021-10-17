package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_11_Test {
    Problem_11.Solver p = new Problem_11.Solver();
    @Test
    public void test1() {
        assertEquals(49, p.solve1(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(49, p.solve2(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{1,1}));
        assertEquals(1, p.solve2(new int[]{1,1}));
    }
    @Test
    public void test3() {
        assertEquals(16, p.solve1(new int[]{4,3,2,1,4}));
        assertEquals(16, p.solve2(new int[]{4,3,2,1,4}));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1(new int[]{1,2,1}));
        assertEquals(2, p.solve2(new int[]{1,2,1}));
    }
}
