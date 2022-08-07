package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{4,4,4,5,6}));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(new int[]{1,1,1,2}));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(new int[]{1,5,6,7}));
    }
}
