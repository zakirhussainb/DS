package com.zakcorp.codechef.beginner;

class JDELAY {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0){
                int N = in.readInt();
                int counter = 0;
                while(N --> 0) {
                    int S = in.readInt();
                    int J = in.readInt();
                    if(J - S > 5) {
                        counter++;
                    }
                }
                out.printLine(counter);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

