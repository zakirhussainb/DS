package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_915_Test
{
    Problem_915.Solver p = new Problem_915.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{5,0,3,8,6}));
    }
    @Test
    public void test2() {
        assertEquals(4, p.solve1(new int[]{1,1,1,0,6,12}));
    }
    @Test
    public void test3() {
        assertEquals(6, p.solve1(new int[]{2,3,1,1,1,0,6,12}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{1,2}));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1(new int[]{1,2,3,4,5}));
    }
}
