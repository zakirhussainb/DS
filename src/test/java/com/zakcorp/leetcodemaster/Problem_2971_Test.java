package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_2971_Test {
    Problem_2971.Solver p = new Problem_2971.Solver();
    @Test
    public void test1() {
        assertEquals(15, p.solve1(new int[]{5,5,5}));
    }
    @Test
    public void test2() {
        assertEquals(12, p.solve1(new int[]{1,12,1,2,5,50,3}));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.solve1(new int[]{5,5,50}));
    }
}
