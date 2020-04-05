package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_202_Test {
    Problem_202.Solver p = new Problem_202.Solver();
    @Test
    public void test1() {
//        assertTrue(p.isHappy_recursive(19));
//        assertFalse(p.isHappy_recursive(2));
        assertTrue(p.isHappy_FloydCycleDetection(19));
//        assertFalse(p.isHappy_FloydCycleDetection(2));
    }
}
