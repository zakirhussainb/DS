package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2139_Test {
    Problem_2139.Solver p = new Problem_2139.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(5, 0));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(19, 2));
    }
    @Test
    public void test3() {
        assertEquals(4, p.solve1(10, 4));
    }
    @Test
    public void test4() {
        assertEquals(500000000, p.solve1(1000_000_000, 1));
    }
}
