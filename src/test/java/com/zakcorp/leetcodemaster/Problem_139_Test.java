package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_139_Test {
    Problem_139.Solver p = new Problem_139.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("leetcode", Arrays.asList("code", "leet") ));
    }
    @Test
    public void test2() {
        assertTrue( p.solve1("applepenapple", Arrays.asList("apple", "pen") ));
    }
    @Test
    public void test3() {
        assertFalse( p.solve1("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat") ));
    }
}
