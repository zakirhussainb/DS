package com.zakcorp.codechef.beginner;

class ADASCOOL {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int m = in.readInt();
                out.printLine(new Solver().solve(n, m));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int n, int m) {
            int mul = n * m;
            return (mul % 2 == 0) ? "YES" : "NO";
        }
    }
}

