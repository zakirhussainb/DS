package com.zakcorp.codechef.beginner;
import java.time.LocalDate;
import java.util.*;
class FLOW015 {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int year = in.readInt();
                out.printLine(new Solver().solve(year));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int year) {
            LocalDate localDate = LocalDate.of(year, 1, 1);
            return localDate.getDayOfWeek().toString().toLowerCase();
        }
    }
}

