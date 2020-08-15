package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1491_Test {
    Problem_1491 p = new Problem_1491();
    @Test
    public void test1() {
        assertEquals(2500.00000, p.average(new int[]{4000,3000,1000,2000}), 2);
    }
}
