package com.zakcorp.leetcodemaster.contest.biweekly.fortyone;

import org.junit.Test;

import static org.junit.Assert.*;

public class A_Test {
    A.Solver p = new A.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
