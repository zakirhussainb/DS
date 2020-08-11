package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_849_Test {
    Problem_849.Solver p = new Problem_849.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,0,0,0,1,0,1}));
        assertEquals(2, p.solve2(new int[]{1,0,0,0,1,0,1}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{1,0,0,0}));
        assertEquals(3, p.solve2(new int[]{1,0,0,0}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{0,1,0,0,1}));
        assertEquals(1, p.solve2(new int[]{0,1,0,0,1}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{0,1}));
        assertEquals(1, p.solve2(new int[]{0,1}));
    }
    @Test
    public void test5() {
        assertEquals(3 , p.solve1(new int[]{1,0,0,0,0,0,0,1}));
        assertEquals(3 , p.solve2(new int[]{1,0,0,0,0,0,0,1}));
    }
}
