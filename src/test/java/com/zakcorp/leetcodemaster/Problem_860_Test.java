package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_860_Test {
    Problem_860.Solver p = new Problem_860.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{5,5,5,10,20}));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(new int[]{5,5,10}));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(new int[]{10,10}));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1(new int[]{5,5,10,10,20}));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }
    @Test
    public void test6() {
        assertFalse(p.solve1(new int[]{5,5,5,10,5,5,10,20,20,20}));
    }
}
