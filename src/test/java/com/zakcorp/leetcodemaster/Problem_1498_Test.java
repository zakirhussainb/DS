package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1498_Test {
    Problem_1498.Solver p = new Problem_1498.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[]{3, 3, 6, 8}, 10));
    }
}
