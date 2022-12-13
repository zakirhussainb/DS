package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1352
{
    // This solution produces a TLE for very large inputs.
    static class Solver {
        LinkedList<Integer> ll;
        public Solver() {
            ll = new LinkedList<>();
        }

        public void add(int num) {
            ll.add(num);
        }

        public int getProduct(int k) {
            int s = ll.size();
            int prod = 1;
            for(int i = s - 1; i >= s - k; i--) {
                prod *= ll.get(i);
            }
            return prod;
        }
    }

    // Optimized solution
    static class Solver1 {
        LinkedList<Long> ll;
        public Solver1() {
            ll = new LinkedList<>();
            ll.add(1L);
        }

        public void add(int num) {
            // If the number is zero, then it means the product will be zero. So we must reset the prefix array.
            // All products that include zero will be zero as well.
            if(num == 0) {
                ll = new LinkedList<>();
                ll.add( 1L );
            } else {
                // We need to maintain the running product in the prefix array.
                ll.add(ll.getLast() * num);
            }
        }

        public int getProduct(int k) {
            int size = ll.size();
            // We can just check if k is greater than equal to the size of our prefix array, and return zero in that case.
            if(k >= size)
                return 0;
            // To get the product of the last k elements, we divide the last running product by the product that was k - 1 steps ago.
            return (int)(ll.getLast() / ll.get( size - k - 1 ));
        }
    }
}
