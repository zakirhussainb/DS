package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_283_Test {
    @Test
    public void test1() {
        Problem_283.Solver p = new Problem_283.Solver();
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{0,1,0,3,12}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{0,-1,0,-3,-12}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{0,0,1}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{1,0,0}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{1,0,1}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{0}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{1}));
        assertEquals(new int[]{1,3,12,0,0}, p.moveZeroes(new int[]{}));
    }
    @Test
    public void test2() {
        Problem_283.Solver p = new Problem_283.Solver();
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{0, 1, 0, 3, 12}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{0,-1,0,-3,-12}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{0,0,1}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{1,0,0}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{1,0,1}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{0}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{1}));
        assertEquals(new int[]{1,3,12,0,0}, p.solve2(new int[]{}));
    }
}
