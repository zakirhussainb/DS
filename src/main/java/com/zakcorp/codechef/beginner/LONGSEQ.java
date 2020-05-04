package com.zakcorp.codechef.beginner;
import java.util.*;
class LONGSEQ {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                out.printLine(new Solver().solve(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str) {
            int[] count = new int[2];
            int n = str.length();
            for(int i = 0; i < n; i++) {
                count[str.charAt(i) - 48]++;
            }
            return (count[0] == 1 || count[1] == 1) ? "Yes" : "No";
        }
    }
}

