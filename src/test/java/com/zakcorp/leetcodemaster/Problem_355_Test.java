package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_355_Test {
    Problem_355 p = new Problem_355();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, p.solve1(new int[]{2, 7, 11, 15}, 9));
    }
}
