package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1041_Test {
    Problem_1041.Solver p = new Problem_1041.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("GGLLGG"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("GG"));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1("GL"));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1("GGGLGLGLGG"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("GGGRGLGL"));
    }
}
