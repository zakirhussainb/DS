package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("ilovecodingonleetcode", "code"));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1("abcba", "abc"));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1("abbaccaddaeea", "aaaaa"));
    }
}
