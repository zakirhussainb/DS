package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_290_Test {
    Problem_290.Solver p = new Problem_290.Solver();

    @Test
    public void test1() {
        assertTrue(p.wordPattern("abba", "dog cat cat dog"));
    }
    @Test
    public void test2() {
        assertFalse(p.wordPattern("abba", "dog cat cat fish"));
    }
    @Test
    public void test3() {
        assertFalse(p.wordPattern("aaaa", "dog cat cat dog"));
    }
    @Test
    public void test4() {
        assertFalse(p.wordPattern("abba", "dog dog dog dog"));
    }
    @Test
    public void test5() {
        assertTrue(p.wordPattern("&**&", "dog cat cat dog"));
    }
    @Test
    public void test6() {
        assertTrue(p.wordPattern(" & &", "dog cat dog cat"));
    }
    @Test
    public void test7() {
        assertTrue(p.wordPattern("aaa", "aa aa aa aa"));
    }
}
