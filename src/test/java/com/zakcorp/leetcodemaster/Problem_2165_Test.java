package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2165_Test
{
    Problem_2165.Solver p = new Problem_2165.Solver();
    @Test
    public void test1() {
        assertEquals(103, p.solve1(310));
    }
    @Test
    public void test2() {
        assertEquals(-7650, p.solve1(-7605));
    }
    @Test
    public void test3() {
        assertEquals(50059, p.solve1(95005));
    }
}
