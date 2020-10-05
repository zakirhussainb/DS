package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_202_Test {
    Problem_202.Solver p = new Problem_202.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(19));
        assertTrue(p.solve2(19));
        assertTrue(p.solve3(19));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(12));
        assertFalse(p.solve2(12));
        assertFalse(p.solve3(12));
    }
}
