package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B p = new Problem_B();
    @Test
    public void test1() {
        assertEquals( 2, p.maxCount( new int[]{1,6,5}, 5, 6 ) );
    }
    @Test
    public void test2() {
        assertEquals( 0, p.maxCount( new int[]{1,2,3,4,5,6,7}, 8, 1 ) );
    }
    @Test
    public void test3() {
        assertEquals( 7, p.maxCount( new int[]{11}, 7, 50 ) );
    }
}
