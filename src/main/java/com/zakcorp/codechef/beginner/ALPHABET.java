package com.zakcorp.codechef.beginner;

import java.util.*;

class ALPHABET {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            String jeffStr = in.readString();
            int len = jeffStr.length();
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < len; i++) {
                set.add(jeffStr.charAt(i));
            }
            int n = in.readInt();
            while(n --> 0) {
                String str = in.readString();
                out.printLine(new Solver().solve(set, str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(Set<Character> set, String str) {
            int m = str.length();
            int counter = 0;
            for(int i = 0; i < m; i++) {
                if(set.contains(str.charAt(i))) {
                    counter++;
                }
            }
            return counter == m ? "Yes" : "No";
        }
    }
}

