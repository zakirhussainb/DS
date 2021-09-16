package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Problem_383_Test {
    Problem_383.Solver p = new Problem_383.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("aab", "baa") );
    }
}
