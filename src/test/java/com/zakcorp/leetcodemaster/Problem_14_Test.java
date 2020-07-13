package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_14_Test {
    Problem_14.Solver p = new Problem_14.Solver();
    @Test
    public void test1() {
        assertEquals("fl", p.solve(new String[]{"flower","flow","flight"}));
        assertEquals("fl", p.solve1(new String[]{"flower","flow","flight"}));
    }
    @Test
    public void test2() {
        assertEquals("", p.solve(new String[]{"dog","racecar","car"}));
        assertEquals("", p.solve1(new String[]{"dog","racecar","car"}));
    }
}
