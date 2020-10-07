package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_457_Test {
    Problem_457.Solver p = new Problem_457.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{2, -1, 1, 2, 2}));
    }
}
