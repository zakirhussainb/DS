package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_172_Test {
    Problem_172.Solver p = new Problem_172.Solver();

    @Test
    public void test1() {
        assertEquals(29998, p.trailingZeroes(120000));
    }
}
