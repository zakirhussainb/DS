package com.zakcorp.codechef.beginner;

import java.util.HashSet;
import java.util.Set;

class HOWMANY {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
//            String str = in.readString();
            int n = in.readInt();
//            out.printLine(new Solver().solve(str));
            out.printLine(new Solver().solve(n));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str) {
            String res;
            int n = str.length();
            switch (n) {
                case 1:
                    res = "1";
                    break;
                case 2:
                    res = "2";
                    break;
                case 3:
                    res = "3";
                    break;
                default:
                    res = "More than 3 digits";
            }
            return res;
        }
        public String solve(int n) {
            int counter = 0;
            while(n > 0) {
                n = n / 10;
                counter++;
            }
            return (counter == 1 || counter == 2 || counter == 3) ? String.valueOf(counter) : "More than 3 digits";
        }
    }
}

