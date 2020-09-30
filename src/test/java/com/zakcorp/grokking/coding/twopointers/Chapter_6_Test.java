package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Chapter_6_Test {
    Chapter_6 p = new Chapter_6();
    @Test
    public void test1() {
        assertEquals(1, p.searchTriplet(new int[]{-2, 0, 1, 2}, 2));
    }
    @Test
    public void test2() {
        assertEquals(0, p.searchTriplet(new int[]{-3, -1, 1, 2}, 1));
    }
    @Test
    public void test3() {
        assertEquals(3, p.searchTriplet(new int[]{1, 0, 1, 1}, 100));
    }
    @Test
    public void test4() {
        assertEquals(2, p.searchTriplet(new int[]{-1,2,1,-4}, 1));
    }
}
