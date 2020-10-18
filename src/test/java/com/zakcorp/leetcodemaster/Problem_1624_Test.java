package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1624_Test {
    Problem_1624.Solver p = new Problem_1624.Solver();
    @Test
    public void test1() {
        assertEquals(0, p.solve1("aa"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("abca"));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.solve1("cbzxy"));
    }
    @Test
    public void test4() {
        assertEquals(4, p.solve1("cabbac"));
    }
    @Test
    public void test5() {
        assertEquals(4, p.solve1("ojdncpvyneq"));
    }
    @Test
    public void test6() {
        assertEquals(18, p.solve1("mgntdygtxrvxjnwksqhxuxtrv"));
    }
}
