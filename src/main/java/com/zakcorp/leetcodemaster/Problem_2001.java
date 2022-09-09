package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2001
{
    static class Solver
    {
        public long solve1( int[][] rectangles )
        {
            long ans = 0;
            Map<Double, Integer> map = new HashMap<>();
            for ( int[] rec : rectangles )
            {
                double ratio = Double.valueOf( rec[0] ) / Double.valueOf( rec[1] );
                ans += map.getOrDefault( ratio, 0 );
                map.put( ratio, map.getOrDefault( ratio, 0 ) + 1 );
            }
            return ans;
        }
        public long solve2(int[][] rectangles) {
            double[] arr = new double[rectangles.length];
            for(int i = 0; i < rectangles.length; i++) {
                arr[i] = (double)rectangles[i][0] / rectangles[i][1];
            }
            Arrays.sort(arr);
            int j = 0;
            long count = 0;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] == arr[i + 1])
                    count += i - j + 1;
                else
                    j = i + 1;
            }
            return count;
        }
    }
    static class Solver1
    {
        public long solve1( int[][] rectangles )
        {
            long ans = 0;
            Map<String, Integer> map = new HashMap<>();
            for(int[] rec : rectangles) {
                long gcd = findGCD( rec[0], rec[1] );
                String str = rec[0]/gcd + "_" + rec[1]/gcd;
                ans += map.getOrDefault( str, 0 );
                map.put( str, map.getOrDefault( str, 0 ) + 1 );
            }
            return ans;
        }
        private long findGCD(int a, int b) {
            if(a == 0){
                return b;
            }
            return findGCD(b % a, a);
        }
    }
}
