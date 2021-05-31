package com.zakcorp.dynamicprogramming;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HowSum_Part_Test {
    HowSum_Part.Solver p = new HowSum_Part.Solver();
    HowSum_Part.Solver1 p1 = new HowSum_Part.Solver1();
    private long startAt;
    @Before
    public void before() {
        this.startAt = System.currentTimeMillis();
    }
    @Test(timeout = 1000)
    public void test1() {
        assertEquals(Arrays.asList(2, 2, 2, 2), p.howSum(8, new int[]{2, 3, 5}));
        assertEquals(Arrays.asList(2, 2, 2, 2), p1.howSum(8, new int[]{2, 3, 5}));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(4, 4), p.howSum(8, new int[]{3, 4, 6}));
        assertEquals(Arrays.asList(4, 4), p1.howSum(8, new int[]{3, 4, 6}));
    }
    @Test
    public void test3() {
        assertEquals(Collections.emptyList(), p.howSum(0, new int[]{3, 4, 6}));
        assertEquals(Collections.emptyList(), p1.howSum(0, new int[]{3, 4, 6}));
    }
    @Test
    public void test4() {
        assertEquals(Collections.emptyList(), p.howSum(0, new int[]{3, 4, 6}));
        assertEquals(Collections.emptyList(), p1.howSum(0, new int[]{3, 4, 6}));
    }
    @Test
    public void test5() {
        assertNull(p.howSum(300, new int[]{7, 14}));
//        assertNull(p1.howSum(300, new int[]{7, 14}));
    }

    @After
    public void after() {
        System.out.println(String.format("Time Limit Exceeded", System.currentTimeMillis() - startAt));
    }
}
