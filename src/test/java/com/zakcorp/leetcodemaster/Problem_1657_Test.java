package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1657_Test
{
    Problem_1657.Solver p = new Problem_1657.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("abc", "bca"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("a", "aa"));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1("cabbba", "abbccc"));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1("a", "b"));
    }
    @Test
    public void test5() {
        assertFalse(p.solve1("ab", "bc"));
    }
}
