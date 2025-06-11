package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_3365_Test
{
    Problem_3365.Solver p = new Problem_3365.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("abcd", "cdab", 2));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1("aabbcc", "bbaacc", 3));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1("aabbcc", "bbaacc", 2));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1("abba", "baba", 2));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("aa", "aa", 2));
    }
}
