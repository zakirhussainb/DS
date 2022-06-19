package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_509_Test {
    Problem_509.Solver p = new Problem_509.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(5));
        assertEquals(5, p.solve2(5));
        assertEquals(5, p.solve3(5));
    }
    @Test
    public void test2() {
        assertEquals(21, p.solve1(8));
        assertEquals(21, p.solve2(8));
        assertEquals(21, p.solve3(8));
    }
}
