package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1471_Test {
    Problem_1471.Solver p = new Problem_1471.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 1}, p.solve1(new int[]{1,2,3,4,5}, 2));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{5, 5}, p.solve1(new int[]{1,1,3,5,5}, 2));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{11,8,6,6,7}, p.solve1(new int[]{6,7,11,7,6,8}, 5));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{513}, p.solve1(new int[]{513}, 1));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{598,521,-918,-532,-493,-76,-262}, p.solve1(new int[]{-493,598,-262,-918,-76,-532,521}, 7));
    }
}
