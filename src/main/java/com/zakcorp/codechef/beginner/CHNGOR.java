package com.zakcorp.codechef.beginner;

class CHNGOR {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int sum = 0;
                for(int i = 0; i < N; i++) {
                    sum |= in.readInt();
                }
                out.printLine(sum);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

