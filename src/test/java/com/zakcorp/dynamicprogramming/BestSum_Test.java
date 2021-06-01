package com.zakcorp.dynamicprogramming;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BestSum_Test {
    BestSum.Solver p = new BestSum.Solver();
    BestSum.Solver1 p1 = new BestSum.Solver1();
//    HowSum.Solver2 p2 = new HowSum.Solver2();

    @Test
    public void test1() {
        assertEquals(Collections.singletonList(7), p.bestSum(7, new int[]{5, 3, 4 ,7}));
        assertEquals(Collections.singletonList(7), p1.bestSum(7, new int[]{5, 3, 4 ,7}));
    }
    @Test
    public void test2() {
        assertEquals(List.of(5, 3), p.bestSum(8, new int[]{2, 3, 5}));
        assertEquals(List.of(5, 3), p1.bestSum(8, new int[]{2, 3, 5}));
    }
    @Test
    public void test3() {
        assertEquals(List.of(4, 4), p.bestSum(8, new int[]{1, 4, 5}));
        assertEquals(List.of(4, 4), p1.bestSum(8, new int[]{1, 4, 5}));
    }
    @Test
    public void test4() {
//        assertEquals(List.of(25, 25, 25, 25), p.bestSum(100, new int[]{1, 2,  5, 25}));
        assertEquals(List.of(25, 25, 25, 25), p1.bestSum(100, new int[]{1, 2, 5, 25}));
    }
}
