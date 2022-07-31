package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_D_Test {
    Problem_D.Solver p = new Problem_D.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.longestCycle(new int[]{3,3,4,2,3}));
    }

    @Test
    public void test2() {
        assertEquals(-1, p.longestCycle(new int[]{2,-1,3,1}));
    }

    @Test
    public void test3() {
        assertEquals(3, p.longestCycle(new int[]{3,4,0,2,-1,2}));
    }
}
