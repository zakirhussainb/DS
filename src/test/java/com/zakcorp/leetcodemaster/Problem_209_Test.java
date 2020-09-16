package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_209_Test {
    Problem_209.Solver p = new Problem_209.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(7, new int[]{2, 3, 1, 2, 4, 3}));
        assertEquals(2, p.solve2(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(10, new int[]{1,2,3,4,5}));
        assertEquals(3, p.solve2(10, new int[]{1,2,3,4,5}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(3, new int[]{1,1}));
        assertEquals(0, p.solve2(3, new int[]{1,1}));
    }
    @Test
    public void test4() {
        assertEquals(5, p.solve1(15, new int[]{1,2,3,4,5}));
        assertEquals(5, p.solve2(15, new int[]{1,2,3,4,5}));
    }
    @Test
    public void test5() {
//        assertEquals(8, p.solve1(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
        assertEquals(8, p.solve2(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
