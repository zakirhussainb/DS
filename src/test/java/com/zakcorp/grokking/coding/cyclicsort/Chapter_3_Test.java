package com.zakcorp.grokking.coding.cyclicsort;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class Chapter_3_Test {
    Chapter_3.Solver p = new Chapter_3.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{4,0,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(new int[]{8, 3, 5, 2, 4, 6, 0, 1}));
    }
}
