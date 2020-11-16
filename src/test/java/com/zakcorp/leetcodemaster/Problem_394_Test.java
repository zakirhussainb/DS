package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_394_Test {
    Problem_394.Solver p = new Problem_394.Solver();
    @Test
    public void test1() {
        assertEquals("aaabcbc", p.solve1("3[a]2[bc]"));
    }
    @Test
    public void test2() {
        assertEquals("accaccacc", p.solve1("3[a2[c]]"));
    }
    @Test
    public void test3() {
        assertEquals("abcbcabcbcabcbc", p.solve1("3[a2[bc]]"));
    }
}
