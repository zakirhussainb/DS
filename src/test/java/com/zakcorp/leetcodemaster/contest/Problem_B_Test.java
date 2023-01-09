package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B p = new Problem_B();
    @Test
    public void test1() {
        assertEquals( 50, p.maxKelements( new int[]{10,10,10,10,10}, 5 ) );
    }
    @Test
    public void test2() {
        assertEquals( 17, p.maxKelements( new int[]{1,10,3,3,3}, 3 ) );
    }
}
