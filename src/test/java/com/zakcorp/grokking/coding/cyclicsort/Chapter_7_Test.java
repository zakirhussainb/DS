package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Chapter_7_Test {
    Chapter_7 p = new Chapter_7();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 4}, p.findNumbers(new int[]{3, 1, 2, 5, 2}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 5}, p.findNumbers(new int[]{3, 1, 2, 3, 6, 4}));
    }
}
