package com.zakcorp.codechef.beginner;
import java.util.*;
class COLOR {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String color = in.readString();
                System.out.println(new Solver().solve(color));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(String color) {
            Set<Character> set = new HashSet<>();
            for(Character ch : color.toCharArray()) {
                set.add(ch);
            }
            return set.size() - 1;
        }
    }
}

