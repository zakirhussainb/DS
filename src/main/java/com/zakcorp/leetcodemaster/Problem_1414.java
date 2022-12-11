package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1414
{
    static class Solver {
        public int solve1(int k) {
            List<Integer> list = getAllFibonacciNumbersUnderK(k);
            for(int i = list.size() - 1; i >= 0; i--) {
                int count = 1;
                int sum = list.get( i );
                if(sum == k)
                    return count;
                for(int j = i - 1; j >= 0; j--) {
                    sum += list.get( j );
                    if(sum < k) {
                        count++;
                    } else if(sum > k) {
                        sum -= list.get( j );
                    } else {
                        count++;
                        return count;
                    }
                }
            }
            return -1;
        }
        private List<Integer> getAllFibonacciNumbersUnderK(int k) {
            List<Integer> list = new ArrayList<>();
            int n1 = 1;
            int n2 = 1;
            list.add( n1 ); list.add( n2 );
            for(int i = 2; i <= k; i++) {
                int n3 = n1 + n2;
                if(n3 > k)
                    break;
                list.add( n3 );
                n1 = n2;
                n2 = n3;
            }
            return list;
        }
    }
}
