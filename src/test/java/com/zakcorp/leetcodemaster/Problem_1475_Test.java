package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1475_Test {
    Problem_1475 p = new Problem_1475();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, p.finalPrices(new int[]{8, 4, 6, 2, 3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,3,4,5}, p.finalPrices(new int[]{1,2,3,4,5}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{9,0,1,6}, p.finalPrices(new int[]{10,1,1,6}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{3,6,1,5,0,0,4,5,4}, p.finalPrices(new int[]{4,7,1,9,4,8,8,9,4}));
    }
}
