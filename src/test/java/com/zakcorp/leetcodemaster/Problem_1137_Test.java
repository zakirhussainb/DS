package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1137_Test {
    Problem_1137.Solver p = new Problem_1137.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.tribonacci1(4));
        assertEquals(4, p.tribonacci2(4));
        assertEquals(4, p.tribonacci3(4));
    }
    @Test
    public void test2() {
        assertEquals(1389537, p.tribonacci1(25));
        assertEquals(1389537, p.tribonacci2(25));
        assertEquals(1389537, p.tribonacci3(25));
    }
    @Test
    public void test3() {
//        assertEquals(2082876103, p.tribonacci1(37));
        assertEquals(2082876103, p.tribonacci2(37));
        assertEquals(2082876103, p.tribonacci3(37));
    }
    @Test
    public void test4() {
        assertEquals(0, p.tribonacci1(0));
        assertEquals(0, p.tribonacci2(0));
        assertEquals(0, p.tribonacci3(0));
    }
    @Test
    public void test5() {
        assertEquals(1, p.tribonacci1(1));
        assertEquals(1, p.tribonacci2(1));
        assertEquals(1, p.tribonacci3(1));
    }
    @Test
    public void test6() {
        assertEquals(1, p.tribonacci1(2));
        assertEquals(1, p.tribonacci2(2));
        assertEquals(1, p.tribonacci3(2));
    }
}
