package com.zakcorp.codechef.beginner;

class TRISQ {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int baseOfTriangle = in.readInt();
                System.out.println(new Solver().solve(baseOfTriangle));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int baseOfTriangle) {
            int N = (baseOfTriangle / 2) - 1;
            return ((N * (N + 1)) / 2);
        }
    }
}

