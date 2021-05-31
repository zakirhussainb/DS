package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("acb", "cba", "cdb"));
    }
    @Test
    public void test2() {
        assertFalse( p.solve1("aaa", "a", "aab"));
    }
    @Test
    public void test3() {
        assertTrue( p.solve1("aaa", "a", "aaaa"));
    }
}
