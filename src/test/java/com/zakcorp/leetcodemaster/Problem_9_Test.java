package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_9_Test {
    Problem_9.Solver p = new Problem_9.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(121));
        assertTrue(p.solve2(121));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(-121));
        assertFalse(p.solve2(-121));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(10));
        assertFalse(p.solve2(10));
    }
}
