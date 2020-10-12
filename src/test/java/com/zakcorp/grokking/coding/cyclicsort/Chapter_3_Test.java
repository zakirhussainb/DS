package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Chapter_3_Test {
    Chapter_3 p = new Chapter_3();
    @Test
    public void test1() {
        assertEquals(2, p.findMissingNumber(new int[]{4,0,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(7, p.findMissingNumber(new int[]{8, 3, 5, 2, 4, 6, 0, 1}));
    }
    @Test
    public void test3() {
        assertEquals(2, p.findMissingNumber(new int[]{0, 1, 3}));
    }
}
