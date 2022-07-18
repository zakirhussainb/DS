package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_76_Test {
    Problem_76.Solver p = new Problem_76.Solver();
    @Test
    public void test1() {
        assertEquals("BANC", p.solve1("ADOBECODEBANC", "ABC"));
    }
    @Test
    public void test2() {
        assertEquals("a", p.solve1("a", "a"));
    }
    @Test
    public void test3() {
        assertEquals("", p.solve1("a", "aa"));
    }
    @Test
    public void test4() {
        assertEquals("aa", p.solve1("aa", "aa"));
    }
    @Test
    public void test5() {
        assertEquals("", p.solve1("a", "b"));
    }
    @Test
    public void test6() {
        assertEquals("baa", p.solve1("bbaa", "aba"));
    }
}
