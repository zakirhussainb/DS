package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_219_Test {
    Problem_219.Solver p = new Problem_219.Solver();
    Problem_219.Solver1 p1 = new Problem_219.Solver1();
    @Test
    public void test1() {
        assertTrue(p.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        assertTrue(p1.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }
    @Test
    public void test2() {
        assertTrue(p.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        assertTrue(p1.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
    @Test
    public void test3() {
        assertFalse(p.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
        assertFalse(p1.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
    @Test
    public void test4() {
        assertTrue(p.containsNearbyDuplicate(new int[]{1,1}, 1));
        assertTrue(p1.containsNearbyDuplicate(new int[]{1,1}, 1));
    }
    @Test
    public void test5() {
        assertTrue(p.containsNearbyDuplicate(new int[]{1,1}, 10));
        assertTrue(p1.containsNearbyDuplicate(new int[]{1,1}, 10));
    }
}
