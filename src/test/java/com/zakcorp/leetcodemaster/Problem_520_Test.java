package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_520_Test {
    Problem_520 p = new Problem_520();
    @Test
    public void test1() {
        assertTrue(p.detectCapitalUse("USA"));
    }
    @Test
    public void test2() {
        assertFalse(p.detectCapitalUse("UsA"));
    }
    @Test
    public void test3() {
        assertFalse(p.detectCapitalUse("uSA"));
    }
    @Test
    public void test4() {
        assertFalse(p.detectCapitalUse("USa"));
    }
    @Test
    public void test5() {
        assertTrue(p.detectCapitalUse("usa"));
    }
    @Test
    public void test6() {
        assertFalse(p.detectCapitalUse("usA"));
    }
}
