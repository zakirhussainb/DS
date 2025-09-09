package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Strings_9_Test {
    DP_Strings_9.Recursion p1 = new DP_Strings_9.Recursion();
    DP_Strings_9.Memoization p2 = new DP_Strings_9.Memoization();

    @Test
    public void test1() {
        assertTrue(p1.solve1("xaylmz",  "x?y*z"));
        assertTrue(p2.solve1("xaylmz",  "x?y*z"));
    }

    @Test
    public void test2() {
        assertFalse(p1.solve1("xyza",  "x*z"));
        assertFalse(p2.solve1("xyza",  "x*z"));
    }

    @Test
    public void test3() {
        assertTrue(p1.solve1("abc",  "a?c"));
        assertTrue(p2.solve1("abc",  "a?c"));
    }
}
