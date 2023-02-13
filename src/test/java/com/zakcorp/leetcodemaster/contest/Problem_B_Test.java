package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B p = new Problem_B();
    @Test
    public void test1() {
        assertEquals( 6, p.maxCount( new int[]{0,1,7,4,4,5}, 3, 6 ) );
    }
    @Test
    public void test2() {
        assertEquals( 1, p.maxCount( new int[]{1,7,9,2,5}, 11, 11 ) );
    }
}
