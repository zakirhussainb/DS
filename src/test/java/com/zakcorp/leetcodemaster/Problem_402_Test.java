package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_402_Test {
    Problem_402.Solver p = new Problem_402.Solver();
    @Test
    public void test1() {
        assertEquals("1219", p.solve1("1432219", 3));
    }
    @Test
    public void test2() {
        assertEquals("200", p.solve1("10200", 1));
    }
    @Test
    public void test3() {
        assertEquals("0", p.solve1("10", 2));
    }
    @Test
    public void test4() {
        assertEquals("0", p.solve1("10", 1));
    }
    @Test
    public void test5() {
        assertEquals("11", p.solve1("112", 1));
    }
    @Test
    public void test6() {
        assertEquals("33", p.solve1("5337", 2));
    }
}
