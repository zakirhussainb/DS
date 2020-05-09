package com.zakcorp.codechef.beginner;

class QUADROOT {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            double A = in.readInt();
            double B = in.readInt();
            double C = in.readInt();
            new Solver().solve(A, B, C);
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {
        public void solve(double A, double B, double C) {
            double sqrtVal = Math.sqrt((B * B) - (4 * A * C));
            double x1 = (-B + sqrtVal)/ (2 * A);
            double x2 = (-B - sqrtVal)/ (2 * A);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}

