package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1450_Test {
    Problem_1450.Solver p = new Problem_1450.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
    }

    @Test
    public void test2() {
        assertEquals(0, p.busyStudent(new int[]{4}, new int[]{4}, 5));
    }

    @Test
    public void test3() {
        assertEquals(0, p.busyStudent(new int[]{1,1,1,1}, new int[]{1,3,2,4}, 7));
    }

    @Test
    public void test4() {
        assertEquals(5, p.busyStudent(new int[]{9,8,7,6,5,4,3,2,1}, new int[]{10,10,10,10,10,10,10,10,10}, 5));
    }
}
