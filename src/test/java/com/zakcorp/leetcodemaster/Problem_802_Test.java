package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_802_Test {
    Problem_802 p = new Problem_802();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(2,4,5,6), p.eventualSafeNodes(new int[][]{ {1,2}, {2,3},
                {5}, {0}, {5}, {}, {} }));
    }
    @Test
    public void test2() {
        assertEquals(Collections.singletonList(4), p.eventualSafeNodes(new int[][]{ {0}, {2,3,4},
                {3,4}, {0,4}, {} }));
    }
}
