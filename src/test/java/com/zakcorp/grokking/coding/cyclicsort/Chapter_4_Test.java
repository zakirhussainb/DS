package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Chapter_4_Test {
    Chapter_4 p = new Chapter_4();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(4, 6, 7), p.getAllMissingNumbers(new int[]{2, 3, 1, 8, 2, 3, 5, 1}));
    }
}
