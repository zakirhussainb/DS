package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_989_Test {
    Problem_989 p = new Problem_989();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 2, 3, 4), p.addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(4, 5, 5), p.addToArrayForm(new int[]{2, 7, 4}, 181));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList(1, 0, 2, 1), p.addToArrayForm(new int[]{2, 1, 5}, 806));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0), p.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
    }
    @Test
    public void test5() {
        assertEquals(Arrays.asList(1, 0, 0, 9, 8), p.addToArrayForm(new int[]{9, 9}, 9999));
    }
}
