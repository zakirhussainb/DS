package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_859_Test {
    Problem_859 p = new Problem_859();
    @Test
    public void test1() {
        assertTrue(p.buddyStrings("ab", "ba"));
    }
    @Test
    public void test2() {
        assertFalse(p.buddyStrings("ab", "ab"));
    }
    @Test
    public void test3() {
        assertTrue(p.buddyStrings("aa", "aa"));
    }
    @Test
    public void test4() {
        assertTrue(p.buddyStrings("aaaaaaabc", "aaaaaaabc"));
    }
    @Test
    public void test5() {
        assertTrue(p.buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
