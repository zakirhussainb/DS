package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_49_Test {
    @Test
    public void test1() {
        Problem_49.Solver p = new Problem_49.Solver();
//        assertEquals(6, p.findMaxSubArrayUsingKadane(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        assertEquals(-1, p.findMaxSubArrayUsingKadane(new int[]{-2,-1,-3,-4,-5}));
//        assertEquals(1, p.findMaxSubArrayUsingKadane(new int[]{1}));
        assertEquals(3, p.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
