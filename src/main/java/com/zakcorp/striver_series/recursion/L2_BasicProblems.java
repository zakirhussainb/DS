package com.zakcorp.striver_series.recursion;

public class L2_BasicProblems
{
    protected void printName(int n) {
        if(n == 0)
            return;
        System.out.println("Zakir");
        printName( n - 1 );
    }

    protected void printLinearlyFromOneToN(int start, int n) {
        if(start > n)
            return;
        System.out.println(start);
        printLinearlyFromOneToN( start + 1, n );
    }

    protected void printLinearlyFromNToOne(int n) {
        if(n < 1)
            return;
        System.out.println(n);
        printLinearlyFromNToOne( n - 1 );
    }
}
