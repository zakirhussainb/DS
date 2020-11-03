package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1642_Test {
    Problem_1642.Solver p = new Problem_1642.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{4,2,7,6,9,14,12}, 5, 1));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(new int[]{4,12,2,7,3,18,20,3,19}, 10, 2));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(new int[]{14,3,19,3}, 17, 0));
    }
}