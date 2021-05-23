package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1869_Test {
    Problem_1869.Solver p = new Problem_1869.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("1101"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("111000"));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("110100010"));
    }
}
