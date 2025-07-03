package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_8_Test {
    Problem_8.Solver p = new Problem_8.Solver();
    @Test
    public void test1() {
        assertEquals(42, p.solve1("42"));
    }
    @Test
    public void test2() {
        assertEquals(-42, p.solve1(" -042"));
    }
    @Test
    public void test3() {
        assertEquals(1337, p.solve1("1337c0d3"));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1("0-1"));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1("words and 987"));
    }
}
