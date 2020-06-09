package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_392_Test {
    Problem_392.Solver p = new Problem_392.Solver();

    @Test
    public void test1() {
        assertTrue(p.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2() {
        assertFalse(p.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void test3() {
        assertFalse(p.isSubsequence("aec", "abcde"));
    }

    @Test
    public void test4() {
        assertTrue(p.isSubsequence("ace", "abcde"));
    }

}
