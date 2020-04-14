package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_628_Test {
    Problem_628.Solver p = new Problem_628.Solver();
    @Test
    public void test1() {
        assertEquals(12, p.maximumProduct_approach1(new int[]{1, 2, 3, 2}));
        assertEquals(12, p.maximumProduct_approach2(new int[]{1, 2, 3, 2}));
    }
    @Test
    public void test2() {
        assertEquals(6, p.maximumProduct_approach1(new int[]{1, 2, 3}));
        assertEquals(6, p.maximumProduct_approach2(new int[]{1, 2, 3}));
    }
    @Test
    public void test3() {
        assertEquals(24, p.maximumProduct_approach1(new int[]{1, 2, 3, 4}));
        assertEquals(24, p.maximumProduct_approach2(new int[]{1, 2, 3, 4}));
    }
    @Test
    public void test4() {
        assertEquals(720, p.maximumProduct_approach1(new int[]{-4,-3,-2,-1,60}));
        assertEquals(720, p.maximumProduct_approach2(new int[]{-4,-3,-2,-1,60}));
    }
    @Test
    public void test5() {
        assertEquals(-6, p.maximumProduct_approach1(new int[]{-1,-2,-3}));
        assertEquals(-6, p.maximumProduct_approach2(new int[]{-1,-2,-3}));
    }
}
