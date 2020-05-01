package com.zakcorp.codechef.beginner;

class CHFINTRO {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int N = in.readInt();
            int r = in.readInt();
            for(int i = 1; i <= N; i++)
                out.printLine( (in.readInt() < r) ? "Bad boi" : "Good boi" );
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

