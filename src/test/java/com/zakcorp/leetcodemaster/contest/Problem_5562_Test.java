package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_5562_Test {
    Problem_5562.Solver p = new Problem_5562.Solver();
    @Test
    public void test1() {
        assertEquals(0, p.solve1("aab"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("aaabbbcc"));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1("ceabaacb"));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1("a"));
    }
    @Test
    public void test5() {
        assertEquals(3, p.solve1("abcabc"));
    }
    @Test
    public void test6() {
        assertEquals(2, p.solve1("bbcebab"));
    }
}
