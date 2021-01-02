package com.zakcorp.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanSum_Test {
    CanSum.Solver p = new CanSum.Solver();
    CanSum.Solver1 p1 = new CanSum.Solver1();
    CanSum.Solver2 p2 = new CanSum.Solver2();
    @Test
    public void test1() {
        assertTrue(p.recursive(7, new int[]{2, 3}));
        assertTrue(p1.memoized(7, new int[]{2, 3}));
//        assertTrue(p2.tabulation(7, new int[]{2, 3}));
    }
    @Test
    public void test2() {
        assertTrue(p.recursive(7, new int[]{5, 3, 4 ,7}));
        assertTrue(p1.memoized(7, new int[]{5, 3, 4 ,7}));
//        assertTrue(p2.tabulation(7, new int[]{5, 3, 4 ,7}));
    }
    @Test
    public void test3() {
        assertFalse(p.recursive(7, new int[]{2, 4}));
        assertFalse(p1.memoized(7, new int[]{2, 4}));
//        assertFalse(p2.tabulation(7, new int[]{2, 4}));
    }
    @Test
    public void test4() {
        assertTrue(p.recursive(8, new int[]{2, 3, 5}));
        assertTrue(p1.memoized(8, new int[]{2, 3, 5}));
//        assertTrue(p2.tabulation(8, new int[]{2, 3, 5}));
    }
    @Test
    public void test5() {
//        assertFalse(p.recursive(300, new int[]{7, 14}));
        assertFalse(p1.memoized(300, new int[]{7, 14}));
//        assertFalse(p2.tabulation(300, new int[]{7, 14}));
    }
}
