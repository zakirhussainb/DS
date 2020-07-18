package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_347_Test {
    Problem_347 p = new Problem_347();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2}, p.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, p.topKFrequent(new int[]{1}, 1));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{5,8}, p.topKFrequent(new int[]{3,5,5,5,5,6,7,8,8,8,9,9,0}, 2));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{-1}, p.topKFrequent(new int[]{-1, -1}, 1));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{1, 2}, p.topKFrequent(new int[]{1, 2}, 2));
    }
}
