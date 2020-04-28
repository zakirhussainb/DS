package com.zakcorp.codechef.beginner;

class PALL01 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int num = in.readInt();
                System.out.println(new Solver().solve(num));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int num) {
            int orgNum = num;
            int sum = 0;
            while(num > 0) {
                int rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }
            return (sum == orgNum) ? "wins" : "losses";
        }
    }
}

