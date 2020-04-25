package com.zakcorp.codechef.beginner;

class MATCHES {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int A = in.readInt();
                int B = in.readInt();
                System.out.println(new Solver().solve(A, B));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int A, int B) {
            final int[] matches = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            int sum = A + B;
            int matchesCount = 0;
            while(sum > 0) {
                int rem = sum % 10;
                matchesCount = matchesCount + matches[rem];
                sum = sum / 10;
            }
            return matchesCount;
        }
    }
}

