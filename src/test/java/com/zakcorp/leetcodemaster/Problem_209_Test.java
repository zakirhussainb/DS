package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_209_Test {
    Problem_209 p = new Problem_209();
    @Test
    public void test1() {
        assertEquals(2, p.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
