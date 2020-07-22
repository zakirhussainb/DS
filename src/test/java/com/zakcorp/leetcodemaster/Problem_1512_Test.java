package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1512_Test {
    Problem_1512 p = new Problem_1512();
    @Test
    public void test1() {
        assertEquals(4, p.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    @Test
    public void test2() {
        assertEquals(6, p.numIdenticalPairs(new int[]{1,1,1,1}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.numIdenticalPairs(new int[]{1,2,3}));
    }
}
