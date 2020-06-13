package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1464_Test {
    Problem_1464.Solver p = new Problem_1464.Solver();
    @Test
    public void test1() {
        assertEquals(12, p.maxProduct(new int[]{3,4,5,2}));
    }
    @Test
    public void test2() {
        assertEquals(16, p.maxProduct(new int[]{1,5,4,5}));
    }
    @Test
    public void test3() {
        assertEquals(12, p.maxProduct(new int[]{3,7}));
    }

}
