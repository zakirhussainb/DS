package com.zakcorp.codechef.beginner;

class SNCKYEAR {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int year = in.readInt();
                System.out.println(new Solver().solve(year));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int year) {
            final int[] snackDownYears = {2010, 2015, 2016, 2017, 2019};
            for (int snackDownYear : snackDownYears) {
                if (snackDownYear == year) {
                    return "HOSTED";
                }
            }
            return "NOT HOSTED";
        }
    }
}

