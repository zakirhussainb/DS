package com.zakcorp.codechef.beginner;

class MISSP {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int res = 0;
                for(int i = 0; i < n; i++) {
                    res = res ^ in.readInt();
                }
                out.printLine(res);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

