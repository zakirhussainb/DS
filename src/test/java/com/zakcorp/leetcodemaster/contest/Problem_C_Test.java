package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_C_Test {
    Problem_C.ATM p = new Problem_C.ATM();
    @Test
    public void test1() {
        p.deposit(new int[]{0,0,1,2,1});
        assertArrayEquals(new int[]{0,0,1,0,1}, p.withdraw(600));
        p.deposit(new int[]{0,1,0,1,1});
        assertArrayEquals(new int[]{-1}, p.withdraw(600));
        assertArrayEquals(new int[]{0,1,0,0,1}, p.withdraw(550));
    }
}
