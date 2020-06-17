package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_605_Test {
    Problem_605.Solver p = new Problem_605.Solver();

    @Test
    public void test1() {
        assertTrue(p.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }
    @Test
    public void test2() {
        assertFalse(p.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
    @Test
    public void test3() {
        assertTrue(p.canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2));
    }
}
