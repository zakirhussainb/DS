package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_970_Test {
    Problem_970.Solver p = new Problem_970.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(2,3,4,5,7,9,10),p.powerfulIntegers(2, 3, 10));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(2,4,6,8,10,14),p.powerfulIntegers(3, 5, 15));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList(20000,2,101,200,10001,10100),p.powerfulIntegers(100, 100, 1000000));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList(9,2,3,5),p.powerfulIntegers(2, 1, 10));
    }
}
