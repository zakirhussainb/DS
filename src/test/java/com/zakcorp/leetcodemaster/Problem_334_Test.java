package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_334_Test {
    Problem_334.Solver p = new Problem_334.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve2(new int[]{1,2,3,4,5}));
    }
    @Test
    public void test2() {
        assertFalse(p.solve2(new int[]{5,4,3,2,1}));
    }
    @Test
    public void test3() {
        assertTrue(p.solve2(new int[]{2,1,5,0,4,6}));
    }
}