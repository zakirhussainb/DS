package com.zakcorp.final450.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_275_Test {
    P_275.Stacks p = new P_275.Stacks();
    @Test
    public void test1() {
        P_275.TwoStack sq = new P_275.TwoStack();
        p.push1(2, sq);
        p.push1(3, sq);
        p.push2(4, sq);
        assertEquals(3,  p.pop1( sq ) );
        assertEquals(4,  p.pop2( sq ) );
        assertEquals(-1,  p.pop2( sq ) );
        assertEquals(2,  p.pop1( sq ) );
        assertEquals(-1,  p.pop1( sq ) );
    }
}
