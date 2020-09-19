package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_567_Test {
    Problem_567 p = new Problem_567();
    Problem_567.Solver p1 = new Problem_567.Solver();
    @Test
    public void test1() {
//        assertTrue(p.checkInclusion("ab", "eidbaooo"));
        assertTrue(p1.solve1("ab", "eidbaooo"));
    }
    @Test
    public void test2() {
//        assertFalse(p.checkInclusion("ab", "eidboaoo"));
        assertFalse(p1.solve1("ab", "eidboaoo"));
    }
    @Test
    public void test3() {
//        assertTrue(p.checkInclusion("adc", "dcda"));
        assertTrue(p1.solve1("adc", "dcda"));
    }
    @Test
    public void test4() { // Got Time Limit Exceeded
//        assertTrue(p.checkInclusion("abcdxabcde", "abcdeabcdx"));
        assertTrue(p1.solve1("abcdxabcde", "abcdeabcdx"));
    }
}
