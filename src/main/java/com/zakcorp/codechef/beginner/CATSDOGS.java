package com.zakcorp.codechef.beginner;
import java.time.LocalDate;

class CATSDOGS {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                long C = in.readInt();
                long D = in.readInt();
                long L = in.readInt();
                out.printLine(new Solver().solve(C, D, L));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(long C, long D, long L) {
            long minLegs = C <= 2L * D ? D * 4L : (C - D) * 4L;
            long maxLegs = (C + D) * 4L;
            if(L % 4 == 0 && L >= minLegs && L <= maxLegs) {
                return "yes";
            } else {
                return "no";
            }
        }
    }
}

