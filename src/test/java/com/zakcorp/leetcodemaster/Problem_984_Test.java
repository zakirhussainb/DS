package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_984_Test
{
    Problem_984.Solver p = new Problem_984.Solver();
    @Test
    public void test1() {
        assertEquals("bba", p.solve1(1, 2));
    }
    @Test
    public void test2() {
        assertEquals("aabaabaa", p.solve1(6, 2));
    }
    @Test
    public void test3() {
        assertEquals("aabaa", p.solve1(4, 1));
    }
    @Test
    public void test4() {
        assertEquals("abababab", p.solve1(4, 4));
    }
}
