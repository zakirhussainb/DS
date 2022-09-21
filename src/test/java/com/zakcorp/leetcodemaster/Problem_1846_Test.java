package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1846_Test {
    Problem_1846.Solver p = new Problem_1846.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{100,1,1000}));
        assertEquals(3, p.solve2(new int[]{100,1,1000}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{73,98,9}));
        assertEquals(3, p.solve2(new int[]{73,98,9}));
    }
}
