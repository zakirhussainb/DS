package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_53_Test {
    @Test
    public void test1() {
        Problem_53.Solver p = new Problem_53.Solver();
//        assertEquals(6, p.findMaxSubArrayUsingKadane(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        assertEquals(-1, p.findMaxSubArrayUsingKadane(new int[]{-2,-1,-3,-4,-5}));
//        assertEquals(1, p.findMaxSubArrayUsingKadane(new int[]{1}));
        assertEquals(3, p.findMaxSubArrayUsingKadane(new int[]{1, 2}));
    }
}
