package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_925_Test {
    Problem_925.Solver p = new Problem_925.Solver();

    @Test
    public void test1() {
        assertTrue(p.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void test2() {
        assertFalse(p.isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void test3() {
        assertTrue(p.isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void test4() {
        assertTrue(p.isLongPressedName("laiden", "laiden"));
    }

    @Test
    public void test5() {
        assertFalse(p.isLongPressedName("a", "aac"));
    }

    @Test
    public void test6() {
        assertFalse(p.isLongPressedName("alex", "alexxr"));
    }

    @Test
    public void test7() {
        assertFalse(p.isLongPressedName("pyplrz", "ppyypllr"));
    }
}
