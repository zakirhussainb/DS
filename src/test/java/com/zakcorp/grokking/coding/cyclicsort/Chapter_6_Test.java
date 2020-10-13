package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Chapter_6_Test {
    Chapter_6 p = new Chapter_6();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(5, 4), p.getAllDuplicates(new int[]{3, 4, 4, 5, 5}));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(3, 5), p.getAllDuplicates(new int[]{5, 4, 7, 2, 3, 5, 3}));
    }
}
