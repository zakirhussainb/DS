package com.zakcorp.codechef.beginner;

class FLOW013 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int A = in.readInt();
                int B = in.readInt();
                int C = in.readInt();
                out.printLine(new Solver().solve(A, B, C));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int A, int B, int C) {
            if(A + B + C == 180) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }
}

