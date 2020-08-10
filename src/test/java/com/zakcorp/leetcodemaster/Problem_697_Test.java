package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_697_Test {
    Problem_697.Solver p = new Problem_697.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,2,2,3,1}));
        assertEquals(2, p.solve2(new int[]{1,2,2,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve1(new int[]{1,2,2,3,1,4,2}));
        assertEquals(6, p.solve2(new int[]{1,2,2,3,1,4,2}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{1}));
        assertEquals(1, p.solve2(new int[]{1}));
    }
}
