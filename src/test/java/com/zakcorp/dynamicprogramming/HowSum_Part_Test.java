package com.zakcorp.dynamicprogramming;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HowSum_Part_Test {
    HowSum_Part.Solver p = new HowSum_Part.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 2, 2, 2), p.howSum(8, new int[]{2, 3, 5}));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(4, 4), p.howSum(8, new int[]{3, 4, 6}));
    }
    @Test
    public void test3() {
        assertEquals(Collections.emptyList(), p.howSum(0, new int[]{3, 4, 6}));
    }
}
