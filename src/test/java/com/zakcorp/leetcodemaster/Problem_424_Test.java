package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_424_Test {
    Problem_424.Solver p = new Problem_424.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1("ABAB", 2));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("AABCCBB", 2));
    }
    @Test
    public void test3() {
        assertEquals(4, p.solve1("ABBCB", 1));
    }
    @Test
    public void test4() {
        assertEquals(3, p.solve1("ABCCDE", 1));
    }
}
