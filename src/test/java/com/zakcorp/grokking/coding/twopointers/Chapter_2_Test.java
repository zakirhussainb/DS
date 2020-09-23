package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Chapter_2_Test {
    Chapter_2 p = new Chapter_2();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3}, p.findPairWithTargetSum(new int[]{1, 2, 3, 4, 6}, 6));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 2}, p.findPairWithTargetSum(new int[]{2, 5, 9, 11}, 11));
    }
}
