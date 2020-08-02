package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_20_Test {
    Problem_20 p = new Problem_20();
    @Test
    public void test1() {
        assertTrue(p.isValid("()"));
    }
    @Test
    public void test2() {
        assertTrue(p.isValid("()[]{}"));
    }
    @Test
    public void test3() {
        assertFalse(p.isValid("(]"));
    }
    @Test
    public void test4() {
        assertFalse(p.isValid("([)]"));
    }
    @Test
    public void test5() {
        assertTrue(p.isValid("{[]}"));
    }
    @Test
    public void test6() {
        assertTrue(p.isValid(""));
    }
    @Test
    public void test7() {
        assertFalse(p.isValid(")"));
    }
    @Test
    public void test8() {
        assertFalse(p.isValid("))}}))]]])]]]}}}}((({{{{[[[[[["));
    }
}
