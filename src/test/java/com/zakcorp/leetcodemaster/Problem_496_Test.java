package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_496_Test {
    Problem_496 p = new Problem_496();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{-1, 3, -1}, p.nextGreaterElement(new int[]{4, 1, 2},
                new int[]{1, 3, 4, 2}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, -1}, p.nextGreaterElement(new int[]{2, 4},
                new int[]{1, 2, 3, 4}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{5, 5, 5, -1}, p.nextGreaterElement(new int[]{4,2,3,5},
                new int[]{4,3,2,1,5}));
    }
}
