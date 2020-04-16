package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_804_Test {
    Problem_804.Solver p = new Problem_804.Solver();
    @Test
    public void test1() {
//        assertEquals(2, p.uniqueMorseRepresentations_approach1(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(2, p.uniqueMorseRepresentations_approach2(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
