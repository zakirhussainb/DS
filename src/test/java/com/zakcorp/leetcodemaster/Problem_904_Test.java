package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_904_Test {
    /**
     * 1,2,1 => 3
     * 0,1,2,2 => 3
     * 1,2,3,2,2 => 4
     * 3,3,3,1,2,1,1,2,3,3,4 => 5
     */
    Problem_904 p = new Problem_904();
    @Test
    public void test1() {
        assertEquals(3, p.totalFruit(new int[]{1, 2, 1}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.totalFruit(new int[]{0,1,2,2}));
    }
    @Test
    public void test3() {
        assertEquals(4, p.totalFruit(new int[]{1,2,3,2,2}));
    }
    @Test
    public void test4() {
        assertEquals(5, p.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}
