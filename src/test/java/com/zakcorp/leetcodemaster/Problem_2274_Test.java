package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2274_Test {
    Problem_2274.Solver p = new Problem_2274.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(2, 9, new int[]{4,6}));
    }
}
