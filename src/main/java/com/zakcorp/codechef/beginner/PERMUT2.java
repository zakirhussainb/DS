package com.zakcorp.codechef.beginner;

class PERMUT2 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int N = in.readInt();
            int[] b;
            int[] pos;
            boolean flag;
            flag = true;
            b = new int[N + 1];
            pos = new int[N + 1];
            for(int i = 1; i <= N; i++) {
                b[i] = in.readInt();
                pos[b[i]] = i;
            }
            for(int i = 0; i <= N; i++) {
                if(b[i] != pos[i]) {
                    flag = false;
                    break;
                }
            }
            out.printLine(flag ? "ambiguous" : "not ambiguous");
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }
    static class Solver {

    }
}

