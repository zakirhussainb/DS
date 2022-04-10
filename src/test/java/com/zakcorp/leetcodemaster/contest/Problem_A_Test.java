package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 3412, p.solve1(1234));
    }
    @Test
    public void test2() {
        assertEquals( 87655, p.solve1(65875));
    }
    @Test
    public void test3() {
        assertEquals( 8421, p.solve1(2481));
    }

}
