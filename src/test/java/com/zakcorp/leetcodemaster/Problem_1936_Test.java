package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1936_Test {
    Problem_1936.Solver p = new Problem_1936.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,3,5,10}, 2));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{3,6,8,10}, 3));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{3,4,6,7}, 2));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1(new int[]{3}, 1));
    }
    @Test
    public void test5() {
        assertEquals(3, p.solve1(new int[]{13}, 4));
    }
    @Test
    public void test6() {
        assertEquals(2, p.solve1(new int[]{12}, 4));
    }
}
