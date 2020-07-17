package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_633_Test {
    Problem_633.Solver p = new Problem_633.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(5));
        assertTrue(p.solve2(5));
        assertTrue(p.solve3(5));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(3));
        assertFalse(p.solve2(3));
        assertFalse(p.solve3(3));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1(0));
        assertTrue(p.solve2(0));
        assertTrue(p.solve3(0));
    }
    @Test
    public void test4() {
        assertFalse(p.solve1(7));
        assertFalse(p.solve2(7));
        assertFalse(p.solve3(7));
    }
    @Test
    public void test5() {
//        assertFalse(p.solve1(2147483647));
//        assertFalse(p.solve2(2147483647));
        assertFalse(p.solve3(2147483647));
    }
    @Test
    public void test6() {
        assertTrue(p.solve1(1));
        assertTrue(p.solve2(1));
        assertTrue(p.solve3(1));
    }
    @Test
    public void test7() {
//        assertFalse(p.solve1(999999999));
//        assertFalse(p.solve2(999999999));
        assertFalse(p.solve3(999999999));
    }
}
