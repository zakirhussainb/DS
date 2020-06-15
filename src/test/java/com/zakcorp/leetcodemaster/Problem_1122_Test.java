package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1122_Test {
    Problem_1122.Solver p = new Problem_1122.Solver();
    Problem_1122.Solver1 p1 = new Problem_1122.Solver1();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19} ,
                p.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19} ,
                p1.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }

}
