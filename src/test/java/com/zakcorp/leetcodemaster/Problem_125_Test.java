package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_125_Test {
    Problem_125 p = new Problem_125();
    @Test
    public void test1() {
        assertTrue(p.isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    public void test2() {
        assertFalse(p.isPalindrome("race a car"));
    }
    @Test
    public void test3() {
        assertFalse(p.isPalindrome("0P"));
    }
}
