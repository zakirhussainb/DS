package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chapter_3_Test {
    Chapter_3 p = new Chapter_3();
    @Test
    public void test1() {
        assertEquals(4, p.removeDuplicates(new int[]{2, 3, 3, 3, 6, 9, 9}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.removeDuplicates(new int[]{2, 2, 2, 11}));
    }
}
