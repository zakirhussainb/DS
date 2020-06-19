package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_28_Test {
    Problem_28.Solver p = new Problem_28.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.strStr("hello", "ll"));
    }
    @Test
    public void test2() {
        assertEquals(-1, p.strStr("aaaaa", "bba"));
    }
    @Test
    public void test3() {
        assertEquals(0, p.strStr("aaaaa", ""));
    }
}
