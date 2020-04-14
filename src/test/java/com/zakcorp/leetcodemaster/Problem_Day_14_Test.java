package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_Day_14_Test {
    Problem_Day_14.Solver p = new Problem_Day_14.Solver();
    @Test
    public void test1() {
        assertEquals("cab", p.stringShift("abc", new int[][]{{0, 1}, {1, 2}}));
    }
    @Test
    public void test2() {
        assertEquals("efgabcd", p.stringShift("abcdefg", new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}}));
    }

}
