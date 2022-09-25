package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_791_Test {
    Problem_791.Solver p = new Problem_791.Solver();
    @Test
    public void test1() {
        assertEquals("cbad", p.solve1("cba", "abcd"));
    }
    @Test
    public void test2() {
        assertEquals("cbad", p.solve1("cbafg", "abcd"));
    }
    @Test
    public void test() {
        assertEquals("cccbbbaaafffgggdddeee", p.solve1("cbafg", "abcdefgabcdefggfedcba"));
    }
}
