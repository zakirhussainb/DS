package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_151_Test {
    Problem_151.Solver p = new Problem_151.Solver();
    @Test
    public void test1() {
        assertEquals("world hello", p.reverseWords("  hello world  "));
    }
}
