package com.zakcorp.codechef.beginner;

class FLOW008 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                System.out.println(new Solver().solve(N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int N) {
            if(N < 10) {
                return "What an obedient servant you are!";
            } else {
                return "-1";
            }
        }
    }
}

