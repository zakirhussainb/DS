package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_26_Test {
    Problem_26.Solver p = new Problem_26.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.removeDuplicates(new int[]{1, 1, 2}));
    }
    @Test
    public void test2() {
        assertEquals(5, p.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
