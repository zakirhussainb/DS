package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_167_Test {
    @Test
    public void test1() {
        Problem_167 p = new Problem_167();
        assertArrayEquals(new int[]{1, 2}, p.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
