package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_767_Test {
    Problem_767.Solver p = new Problem_767.Solver();
    @Test
    public void test1() {
        assertEquals("aba", p.solve1("aab"));
    }
    @Test
    public void test2() {
        assertEquals("", p.solve1("aaab"));
    }
    @Test
    public void test3() {
        assertEquals("abaca", p.solve1("abaac"));
    }
    @Test
    public void test4() {
        assertEquals("ababacacb", p.solve1("aaaabbbcc"));
    }
}
