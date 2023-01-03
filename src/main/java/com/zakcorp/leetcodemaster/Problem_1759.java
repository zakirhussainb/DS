package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1759
{
    static class Solver {
        public int solve1(String str) {
            Map<String, Long> map = new HashMap<>();
            int i = 0, n = str.length();
            int mod = 1_000_000_007;
            while(i < n) {
                StringBuilder sb = new StringBuilder();
                int start = i;
                while(i + 1 < n && str.charAt( i ) == str.charAt( i + 1 )) {
                    sb.append( str.charAt( i ) );
                    i++;
                }
                sb.append( str.charAt( i ) );
                String s = sb.toString();
                long m = i - start + 1;
                long x = (m * (m + 1) / 2) % mod;
                if(!map.containsKey( s )) {
                    map.put(s, x);
                } else {
                    map.put(s, map.get( s ) + x);
                }
                i++;
            }
            long sum = 0;
            for(long num : map.values()) {
                sum = (sum + num) % mod;
            }
            return (int)sum;
        }
        public int solve2(String str) {
            int sum = 0, count = 0;
            for(int i = 0; i < str.length(); i++) {
                if(i > 0 && str.charAt( i - 1 ) == str.charAt( i )) {
                    count++;
                } else {
                    count = 1;
                }
                sum = (sum + count) % 1_000_000_007;
            }
            return sum;
        }
    }
}
