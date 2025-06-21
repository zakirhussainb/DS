package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_3016_Test {
    Problem_3016.Solver p = new Problem_3016.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1("abcde"));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("abcde"));
    }
    @Test
    public void test3() {
        assertEquals(24, p.solve1("aabbccddeeffgghhiiiiii"));
    }
}
