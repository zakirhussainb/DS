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
                if(click.equals("CLOSEALL")){
                    System.out.println("0");
                    continue;
                }
                int no = in.readInt();
                System.out.println(new Solver().solve(click, no));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(String click, int no) {
            return click.equals("CLOSEALL") ? 0 : no;
        }
    }
}

