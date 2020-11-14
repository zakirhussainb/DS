package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("aababbab"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1("bbaaaaabb"));
    }
}
