package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1780_Test
{
    Problem_1780.Solver p = new Problem_1780.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(12));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(91));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(21));
    }
}
