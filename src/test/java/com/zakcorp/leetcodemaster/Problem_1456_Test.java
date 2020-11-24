package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1456_Test {
    Problem_1456.Solver p = new Problem_1456.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("abciiidef", 3));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("aeiou", 2));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1("leetcode", 3));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1("rhythms", 4));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1("tryhard", 4));
    }
}
