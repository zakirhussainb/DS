package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1003_Test
{
    Problem_1003.Solver p = new Problem_1003.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("aabcbc"));
    }
    @Test
    public void test2() {
        assertTrue( p.solve1("abcabcababcc"));
    }
    @Test
    public void test3() {
        assertFalse( p.solve1("abccba"));
    }
    @Test
    public void test4() {
        assertFalse( p.solve1("abcacb"));
    }
    @Test
    public void test5() {
        assertFalse( p.solve1("aaabbbccc"));
    }
}
