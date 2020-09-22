package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_80_Test {
    Problem_80 p = new Problem_80();
    @Test
    public void test1() {
        assertEquals(4, p.removeDuplicates(new int[]{2,3,3,3,6,9,9}));
//        assertEquals(5, p.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
