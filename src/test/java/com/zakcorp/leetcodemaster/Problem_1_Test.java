package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1_Test {
    Problem_1 p = new Problem_1();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, p.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
