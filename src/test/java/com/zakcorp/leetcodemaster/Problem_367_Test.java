package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_367_Test {
    Problem_367.Solver p = new Problem_367.Solver();
    Problem_367.Solver1 p1 = new Problem_367.Solver1();
    @Test
    public void test1() {
        assertTrue(p.isPerfectSquare(16));
        assertTrue(p1.isPerfectSquare(16));
    }
    @Test
    public void test2() {
        assertFalse(p.isPerfectSquare(14));
        assertFalse(p1.isPerfectSquare(14));
    }
    @Test
    public void test3() {
        assertFalse(p.isPerfectSquare(2147483647));
        assertFalse(p1.isPerfectSquare(2147483647));
    }
    @Test
    public void test4() {
        assertFalse(p.isPerfectSquare(15));
        assertFalse(p1.isPerfectSquare(15));
    }
}
