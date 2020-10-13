package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Chapter_5_Test {
    Chapter_5 p = new Chapter_5();
    @Test
    public void test1() {
        assertEquals(4, p.findNumber(new int[]{1,4,4,3,2}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.findNumber(new int[]{2, 1, 3, 3, 5, 4}));
    }
    @Test
    public void test3() {
        assertEquals(4, p.findNumber(new int[]{2, 4, 1, 4, 4}));
    }
}
