package com.zakcorp.striver_series.recursion;

public class L5_MultipleRecursionCalls
{
    // The time complexity is -> 2 power N -> for every func there are two calls.
    public int fibonacci(int n) {
        if(n <= 1)
            return n;
        int last = fibonacci( n - 1 );
        int sLast = fibonacci( n - 2 );
        return last + sLast;
    }
}
