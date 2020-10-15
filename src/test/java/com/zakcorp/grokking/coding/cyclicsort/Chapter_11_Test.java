package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Chapter_11_Test {
    Chapter_11 p = new Chapter_11();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 2, 6), p.findNumberX(new int[]{3, -1, 4, 5, 5}, 3));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(1, 5, 6), p.findNumberX(new int[]{2, 3, 4}, 3));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList(1, 2), p.findNumberX(new int[]{-2, -3, 4}, 2));
    }
}
