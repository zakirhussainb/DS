package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_657_Test {
    Problem_657.Solver p = new Problem_657.Solver();
    @Test
    public void test1() {
        assertTrue(p.judgeCircle("UD"));
    }
    @Test
    public void test2() {
        assertFalse(p.judgeCircle("LL"));
    }
    @Test
    public void test3() {
        assertFalse(p.judgeCircle("UULLDDRRLLUUDDRRLL"));
    }
    @Test
    public void test4() {
        assertTrue(p.judgeCircle("UULLDDRRLLUUDDRR"));
    }
    @Test
    public void test5() {
        assertTrue(p.judgeCircle(""));
    }
    @Test
    public void test6() {
        assertFalse(p.judgeCircle("RRDD"));
    }
    @Test
    public void test7() {
        assertFalse(p.judgeCircle("UL"));
    }
    @Test
    public void test8() {
        assertFalse(p.judgeCircle("DR"));
    }
}
