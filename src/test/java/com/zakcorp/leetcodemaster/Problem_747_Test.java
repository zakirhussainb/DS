package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_747_Test {
    Problem_747.Solver p = new Problem_747.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.dominantIndex(new int[]{3, 6, 1, 0}));
    }

    @Test
    public void test2() {
        assertEquals(-1, p.dominantIndex(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertEquals(0, p.dominantIndex(new int[]{20,53,68,23,45,63,17,
                11,12,51,79,30,15,26,80,15,11,64,55,87,8,86,47,99,80,16,31,2,
                84,38,96,60,96,5,69,3,87,39,34,65,7,71,42,33,93,59,41,85,30,55}));
    }
//
    @Test
    public void test4() {
        assertEquals(3, p.dominantIndex(new int[]{0, 0, 0, 1}));
    }
}
