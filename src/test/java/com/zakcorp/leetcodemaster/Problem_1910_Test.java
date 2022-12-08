package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1910_Test
{
    Problem_1910.Solver p = new Problem_1910.Solver();
    @Test
    public void test1() {
        assertEquals("dab", p.solve1("daabcbaabcbc", "abc"));
    }
    @Test
    public void test2() {
        assertEquals("ab", p.solve1("axxxxyyyyb", "xy"));
    }
}
