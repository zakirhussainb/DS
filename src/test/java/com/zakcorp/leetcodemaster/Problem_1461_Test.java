package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1461_Test
{
    Problem_1461.Solver p = new Problem_1461.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("00110110", 2));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1("0110", 1));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("0110", 2));
    }
}
