package com.zakcorp.codechef.beginner;

class ZCOSCH {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int R = in.readInt();
            out.printLine(new Solver().solve(R));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int R) {
            if(R < 1) {
                return 0;
            }
            if(R <= 50) {
                return 100;
            }
            if(R < 101) {
                return 50;
            }
            return 0;
        }
    }
}
