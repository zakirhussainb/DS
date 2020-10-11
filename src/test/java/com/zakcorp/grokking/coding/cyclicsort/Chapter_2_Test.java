package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Chapter_2_Test {
    Chapter_2.Solver p = new Chapter_2.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,3,4,5}, p.solve1(new int[]{3, 1, 5, 4, 2}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,3,4,5,6}, p.solve1(new int[]{2, 6, 4, 3, 1, 5}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1,2,3,4,5,6}, p.solve1(new int[]{1, 5, 6, 4, 3, 2}));
    }
}
