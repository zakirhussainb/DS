package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1299_Test {
    Problem_1299 p = new Problem_1299();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{18,6,6,6,1,-1}, p.replaceElements(new int[]{17,18,5,4,6,1}));
    }
    /* All these passed
     * [1]
     * [100000]
     * [100000,9999,999]
     * [1,1,1,1]
     * [1,10]
     */
}
