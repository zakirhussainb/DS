package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_91_Test {
    Problem_91.Solver p = new Problem_91.Solver();
    Problem_91.Solver1 p1 = new Problem_91.Solver1();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("326"));
        assertEquals(2, p1.solve1("326"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("12"));
        assertEquals(2, p1.solve1("12"));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1("226"));
        assertEquals(3, p1.solve1("226"));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1("0"));
        assertEquals(0, p1.solve1("0"));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1("1"));
        assertEquals(1, p1.solve1("1"));
    }
    @Test
    public void test6() {
        assertEquals(1, p.solve1("9999"));
        assertEquals(1, p1.solve1("9999"));
    }
}
