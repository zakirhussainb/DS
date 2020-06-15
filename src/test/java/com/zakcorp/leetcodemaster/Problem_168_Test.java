package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_168_Test {
    Problem_168.Solver p = new Problem_168.Solver();
    Problem_168.Solver1 p1 = new Problem_168.Solver1();
    @Test
    public void test1() {
        assertEquals("AB" ,p.convertToTitle(28));
        assertEquals("AB" ,p1.convertToTitle(28));
    }

}
