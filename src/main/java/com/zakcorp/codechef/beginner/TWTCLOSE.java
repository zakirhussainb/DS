package com.zakcorp.codechef.beginner;

class TWTCLOSE {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int N = in.readInt();
            int K = in.readInt();
            while(K --> 0) {
                String click = in.readString();
                int tweetNo = 0;
                if(!click.equals("CLOSEALL")) {
                    tweetNo = in.readInt();
                }
                new Solver().solve(click, tweetNo, N);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public void solve(String click, int no, int N) {
            if(click.equals("CLOSEALL")){
                System.out.println(0);
            }
            for(int i = 1; i <= N; i++) {
                if(i == no) {
                    System.out.println(no);
                }
            }
        }
    }
}

