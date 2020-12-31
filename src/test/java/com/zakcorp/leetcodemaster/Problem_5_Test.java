package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5_Test {
    Problem_5.Solver p = new Problem_5.Solver();
    @Test
    public void test1() {
        assertEquals("bab", p.solve1("babad"));
    }
    @Test
    public void test2() {
        assertEquals("bb", p.solve1("cbbd"));
    }
    @Test
    public void test3() {
        assertEquals("a", p.solve1("a"));
    }
    @Test
    public void test4() {
        assertEquals("a", p.solve1("ac"));
    }
    @Test
    public void test5() {
        assertEquals("malayalam", p.solve1("malayalam"));
    }
}
