package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1544_Test {
    Problem_1544.Solver p = new Problem_1544.Solver();
    @Test
    public void test1() {
        assertEquals("leetcode", p.solve1("leEeetcode"));
        assertEquals("leetcode", p.solve2("leEeetcode"));
    }
    @Test
    public void test2() {
        assertEquals("", p.solve1("abBAcC"));
        assertEquals("", p.solve2("abBAcC"));
    }
    @Test
    public void test3() {
        assertEquals("s", p.solve1("s"));
        assertEquals("s", p.solve2("s"));
    }
    @Test
    public void test5() {
        assertEquals("a", p.solve1("aBbcCVv"));
        assertEquals("a", p.solve2("aBbcCVv"));
    }
}
