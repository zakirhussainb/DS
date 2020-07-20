package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_976_Test {
    Problem_976 p = new Problem_976();
    @Test
    public void test1() {
        assertEquals(5, p.largestPerimeter(new int[]{2, 1, 2}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.largestPerimeter(new int[]{1, 2, 1}));
    }
    @Test
    public void test3() {
        assertEquals(10, p.largestPerimeter(new int[]{3, 2, 3, 4}));
    }
    @Test
    public void test4() {
        assertEquals(8, p.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
