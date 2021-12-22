package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1750_Test {
    Problem_1750.Solver p = new Problem_1750.Solver();
    @Test
    public void test1() {
        assertEquals("zab", p.solve1("xyz", 2));
    }
}
