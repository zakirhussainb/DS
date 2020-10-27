package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_693_Test {
    Problem_693.Solver p = new Problem_693.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(5));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(7));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(11));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1(10));
    }
    @Test
    public void test5() {
        assertFalse(p.solve1(3));
    }
}
