package com.zakcorp.codechef.beginner;

import java.util.*;

class LCH15JAB {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                out.printLine(new Solver().solve1(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str){
            int n = str.length();
            final int[] max = {0};
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++)
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            map.forEach( (key, value) -> max[0] = Math.max(max[0], value));
            return (max[0] * 2 == n) ? "YES" : "NO";
        }
        public String solve1(String str) {
            int n = str.length();
            int[] arr = new int[26];
            for(int i = 0; i < n; i++) {
                arr[(int)str.charAt(i) - 97]++;
            }
            Arrays.sort(arr);
            return (arr[25] * 2 == n) ? "YES" : "NO";
        }
    }
}
