package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1004_Test {
    Problem_1004 p = new Problem_1004();
    @Test
    public void test1() {
        assertEquals(6, p.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
