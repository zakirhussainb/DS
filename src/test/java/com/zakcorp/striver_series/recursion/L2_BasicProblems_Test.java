package com.zakcorp.striver_series.recursion;

import org.junit.Test;

public class L2_BasicProblems_Test
{
    @Test
    public void test_printName() {
        L2_BasicProblems l2 = new L2_BasicProblems();
        l2.printName( 5 );
    }

    @Test
    public void test_printLinearlyFromOneToN() {
        L2_BasicProblems l2 = new L2_BasicProblems();
        l2.printLinearlyFromOneToN(1, 5 );
    }

    @Test
    public void test_printLinearlyFromNToOne() {
        L2_BasicProblems l2 = new L2_BasicProblems();
        l2.printLinearlyFromNToOne(5 );
    }
}
