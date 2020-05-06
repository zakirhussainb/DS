package com.zakcorp.codechef.beginner;

import java.io.*;
import java.util.Arrays;

class PLAYSTR {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String S = in.readString();
                String R = in.readString();
                out.printLine(new Solver().solve2(S, R, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public String solve(String S, String R, int n) {
            char[] sArr = S.toCharArray();
            Arrays.sort(sArr);
            char[] rArr = R.toCharArray();
            Arrays.sort(rArr);
            String s1 = new String(sArr);
            String s2 = new String(rArr);
            return s1.equals(s2) ? "YES" : "NO";
        }
        public String solve1(String S, String R, int n) {
            int[] countS = new int[2];
            for(int i = 0; i < n; i++) {
                countS[S.charAt(i) - '0']++;
            }
            int[] countR = new int[2];
            for(int i = 0; i < n; i++) {
                countR[R.charAt(i) - '0']++;
            }
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int k = 0;
            while(k < n){
                sb1.append(k < countS[0] ? 0 : 1);
                sb2.append(k < countR[0] ? 0 : 1);
                k++;
            }
            return sb1.toString().equals(sb2.toString()) ? "YES" : "NO";
        }
        public String solve2(String S, String R, int n) {
            int[] countS = new int[2];
            for(int i = 0; i < n; i++) {
                countS[S.charAt(i) - '0']++;
            }
            int[] countR = new int[2];
            for(int i = 0; i < n; i++) {
                countR[R.charAt(i) - '0']++;
            }
            int counter = 0;
            for(int i = 0; i < 2; i++) {
                if(countS[i] == countR[i]) {
                    counter++;
                }
            }
            return counter == 2 ? "YES" : "NO";
        }
    }
}

