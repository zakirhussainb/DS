package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{2,3,1,1,4}));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(new int[]{3,2,1,0,4}));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(new int[]{2,0,0}));
    }
}
