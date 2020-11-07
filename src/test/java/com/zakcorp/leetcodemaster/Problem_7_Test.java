package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_7_Test {
    Problem_7.Solver p = new Problem_7.Solver();
    @Test
    public void test1() {
        assertEquals(321, p.solve1(123));
    }
    @Test
    public void test2() {
        assertEquals(-321, p.solve1(-123));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(-2147483647));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1(2147483647));
    }
}
