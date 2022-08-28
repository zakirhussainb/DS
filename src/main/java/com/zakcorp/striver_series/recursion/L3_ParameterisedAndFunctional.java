package com.zakcorp.striver_series.recursion;

public class L3_ParameterisedAndFunctional
{
    public void sumOfNNumbers_Parameterised(int n, int sum) {
        if(n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers_Parameterised( n - 1, sum + n);
    }

    public int sumOfNNumbers_Functional(int n) {
        if(n == 0)
            return 0;
        return n + sumOfNNumbers_Functional( n - 1 );
    }

    public int factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial( n - 1 );
    }
}
