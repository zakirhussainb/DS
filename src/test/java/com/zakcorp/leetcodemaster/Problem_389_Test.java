package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_389_Test {
    Problem_389.Solver p = new Problem_389.Solver();
    @Test
    public void test1() {
        assertEquals('e', p.solve1("abcd", "abced"));
    }
    @Test
    public void test2() {
        assertEquals('y', p.solve1("", "y"));
    }
    @Test
    public void test3() {
        assertEquals('a', p.solve1("a", "aa"));
    }
    @Test
    public void test4() {
        assertEquals('a', p.solve1("ae", "aea"));
    }
}
