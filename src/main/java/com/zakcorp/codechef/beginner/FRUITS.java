package com.zakcorp.codechef.beginner;

class FRUITS {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int apples = in.readInt();
                int oranges = in.readInt();
                int K = in.readInt();
                out.printLine(new Solver().solve(apples, oranges, K));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int apples, int oranges, int K){
            for(int i = 1; i <= K; i++){
                if(apples < oranges) {
                    apples++;
                } else if(oranges < apples) {
                    oranges++;
                } else {
                    break;
                }
            }
            return (apples >= oranges) ? apples - oranges : oranges - apples;
        }
    }
}
