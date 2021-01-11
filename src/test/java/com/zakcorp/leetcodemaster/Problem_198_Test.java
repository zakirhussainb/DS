package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_198_Test {
    Problem_198.Solver p = new Problem_198.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{1,2,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(12, p.solve1(new int[]{2,7,9,3,1}));
    }
    @Test
    public void test3() {
        assertEquals(120, p.solve1(new int[]{100,50,20}));
    }
}
