package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_921_Test {
    Problem_921.Solver p = new Problem_921.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1("())"));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1("((("));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1("()"));
    }
    @Test
    public void test4() {
        assertEquals(4, p.solve1("()))(("));
    }
    @Test
    public void test5() {
        assertEquals(6, p.solve1(")))((("));
    }
    @Test
    public void test6() {
        assertEquals(0, p.solve1(""));
    }
}
