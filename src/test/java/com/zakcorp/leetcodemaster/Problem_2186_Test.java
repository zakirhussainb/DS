package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2186_Test {
    Problem_2186.Solver p = new Problem_2186.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1("leetcode", "coats"));
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve1("leetcode", "coatse"));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1("night", "thing"));
    }
}
