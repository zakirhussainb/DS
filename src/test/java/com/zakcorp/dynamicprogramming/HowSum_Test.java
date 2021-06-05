package com.zakcorp.dynamicprogramming;

import com.zakcorp.revision.RevisionProblem;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class HowSum_Test {
    HowSum.Solver p = new HowSum.Solver();
    HowSum.Solver1 p1 = new HowSum.Solver1();
    HowSum.Solver2 p2 = new HowSum.Solver2();
    RevisionProblem.RevisionSolver revSolver = new RevisionProblem.RevisionSolver();
    @Test
    public void test1() {
//        assertArrayEquals(new int[]{3, 2, 2}, p.recursive(7, new int[]{2, 3}));
//        assertArrayEquals(new int[]{3, 2, 2}, p1.memoized(7, new int[]{2, 3}));
//        assertArrayEquals(new int[]{3, 2, 2}, p2.tabulation(7, new int[]{2, 3}));
//        assertArrayEquals(new int[]{3, 2, 2}, p2.tabulation(7, new int[]{2, 3}));
    }
    @Test
    public void test2() {
        assertEquals(List.of(4, 3), p.recursive(7, new int[]{5, 3, 4 ,7}));
        assertEquals(List.of(4, 3), p1.memoized(7, new int[]{5, 3, 4 ,7}));
        assertEquals(List.of(7), p2.tabulation(7, new int[]{5, 3, 4 ,7}));
        assertEquals(List.of(7), revSolver.howSum(7, new int[]{5, 3, 4 ,7}));
    }
//    @Test
//    public void test3() {
//        assertFalse(p.recursive(7, new int[]{2, 4}));
//        assertFalse(p1.memoized(7, new int[]{2, 4}));
//        assertFalse(p2.tabulation(7, new int[]{2, 4}));
//    }
//    @Test
//    public void test4() {
//        assertTrue(p.recursive(8, new int[]{2, 3, 5}));
//        assertTrue(p1.memoized(8, new int[]{2, 3, 5}));
//        assertTrue(p2.tabulation(8, new int[]{2, 3, 5}));
//    }
//    @Test
//    public void test5() {
////        assertFalse(p.recursive(300, new int[]{7, 14})); // TLE
//        assertFalse(p1.memoized(300, new int[]{7, 14})); // 776 ms
////        assertFalse(p2.tabulation(300, new int[]{7, 14})); // 2 ms
//    }
}
