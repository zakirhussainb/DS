package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_342_Test {
    Problem_342.Solver p1 = new Problem_342.Solver();

    @Test
    public void test1() {
        assertTrue(p1.solve1(16));
        assertTrue(p1.solve2(16));
    }
    @Test
    public void test2() {
        assertTrue(p1.solve1(64));
        assertTrue(p1.solve2(64));
    }
    @Test
    public void test3() {
        assertFalse(p1.solve1(32));
        assertFalse(p1.solve2(32));
    }
    @Test
    public void test4() {
        assertFalse(p1.solve1(1162261466));
        assertFalse(p1.solve2(1162261466));
    }
}
