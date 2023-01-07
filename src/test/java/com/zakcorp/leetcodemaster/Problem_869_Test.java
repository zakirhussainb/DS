package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_869_Test
{
    Problem_869.Solver p = new Problem_869.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(1));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(10));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(652));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1(80));
    }
}
