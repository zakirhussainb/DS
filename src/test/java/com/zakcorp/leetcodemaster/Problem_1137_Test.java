package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1137_Test {
    Problem_1137.Solver p = new Problem_1137.Solver();
    Problem_1137.Solver1 p1 = new Problem_1137.Solver1();
    @Test
    public void test1() {
        assertEquals(4, p.tribonacci(4));
        assertEquals(4, p1.tribonacci(4));
    }
    @Test
    public void test2() {
        assertEquals(1389537, p.tribonacci(25));
        assertEquals(1389537, p1.tribonacci(25));
    }
    @Test
    public void test3() {
        assertEquals(2082876103, p.tribonacci(37));
        assertEquals(2082876103, p1.tribonacci(37));
    }
    @Test
    public void test4() {
        assertEquals(0, p.tribonacci(0));
        assertEquals(0, p1.tribonacci(0));
    }
    @Test
    public void test5() {
        assertEquals(1, p.tribonacci(1));
        assertEquals(1, p1.tribonacci(1));
    }
    @Test
    public void test6() {
        assertEquals(1, p.tribonacci(2));
        assertEquals(1, p1.tribonacci(2));
    }
}
