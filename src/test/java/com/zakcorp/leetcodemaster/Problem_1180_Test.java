package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1180_Test {
    Problem_1180.Solver p = new Problem_1180.Solver();
    @Test
    public void test1() {
        assertEquals(8, p.solve1("aaaba"));
        assertEquals(8, p.solve2("aaaba"));
        assertEquals(8, p.solve3("aaaba"));
        assertEquals(8, p.solve4("aaaba"));
    }
    @Test
    public void test2() {
        assertEquals(55, p.solve1("aaaaaaaaaa"));
        assertEquals(55, p.solve2("aaaaaaaaaa"));
        assertEquals(55, p.solve3("aaaaaaaaaa"));
        assertEquals(55, p.solve4("aaaaaaaaaa"));
    }
}
