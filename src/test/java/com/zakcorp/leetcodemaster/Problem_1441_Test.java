package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_1441_Test {
    Problem_1441.Solver p = new Problem_1441.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("Push","Push","Pop","Push"), p.buildArray(new int[]{1,3}, 3));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("Push","Push","Push"), p.buildArray(new int[]{1,2,3}, 3));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList("Push","Push"), p.buildArray(new int[]{1,2}, 4));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList("Push","Pop","Push","Push","Push"), p.buildArray(new int[]{2,3,4}, 4));
    }
    @Test
    public void test5() {
        assertEquals(Arrays.asList("Push","Pop","Push","Pop","Push","Pop","Push","Pop","Push"), p.buildArray(new int[]{5}, 1));
    }

}
