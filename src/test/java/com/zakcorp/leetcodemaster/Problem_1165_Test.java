package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1165_Test {
    Problem_1165.Solver p = new Problem_1165.Solver();
    @Test
    public void test1() {
        assertEquals(73, p.solve1("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }
}
