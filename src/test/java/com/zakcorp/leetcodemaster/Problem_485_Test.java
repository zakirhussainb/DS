package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_485_Test {
    Problem_485.Solver p = new Problem_485.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{1,1,0,1,1,1}));
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve1(new int[]{1,1,1,1,1,1}));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1(new int[]{0,1,1,0,1,0}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{0,1,0}));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1(new int[]{0,0,0,0,0,0}));
    }
    @Test
    public void test6() {
        assertEquals(2, p.solve1(new int[]{0,1,1,0}));
    }
}
