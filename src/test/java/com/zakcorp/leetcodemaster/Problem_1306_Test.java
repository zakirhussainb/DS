package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1306_Test {
    Problem_1306.Solver p = new Problem_1306.Solver();
    @Test
    public void test1() {
        assertTrue(p.canReach(new int[]{4,2,3,0,3,1,2}, 5));
    }
    @Test
    public void test2() {
        assertTrue(p.canReach(new int[]{4,2,3,0,3,1,2}, 0));
    }
    @Test
    public void test3() {
        assertFalse(p.canReach(new int[]{3,0,2,1,2}, 2));
    }
}
