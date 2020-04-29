package com.zakcorp.codechef.beginner;

class COMM3 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int R = in.readInt();
                int x1 = in.readInt();
                int y1 = in.readInt();
                int x2= in.readInt();
                int y2 = in.readInt();
                int x3 = in.readInt();
                int y3 = in.readInt();
                System.out.println(new Solver().solve(R, x1, y1, x2, y2, x3, y3));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int r, int x1, int y1, int x2, int y2, int x3, int y3) {
            int d1 = (int)Math.pow(x1 - x2, 2) + (int)Math.pow(y1 - y2, 2);
            int d2 = (int)Math.pow(x1 - x3, 2) + (int)Math.pow(y1 - y3, 2);
            int d3 = (int)Math.pow(x2 - x3, 2) + (int)Math.pow(y2 - y3, 2);
            if( (d1 <= r * r && d2 <= r * r) || (d1 <= r * r && d3 <= r * r) ||
                    (d2 <= r * r && d3 <= r * r)) {
                return "yes";
            } else {
                return "no";
            }
        }
    }
}

