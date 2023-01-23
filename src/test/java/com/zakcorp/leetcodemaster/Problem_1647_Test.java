package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1647_Test
{
    Problem_1647.Solver p = new Problem_1647.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("aaabbbcc"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("aab"));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1("ceabaacb"));
    }
}
