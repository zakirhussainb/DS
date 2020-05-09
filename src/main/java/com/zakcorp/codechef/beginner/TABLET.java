package com.zakcorp.codechef.beginner;

class TABLET {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while (tc-- > 0) {
                int N = in.readInt();
                int B = in.readInt();
                int max = Integer.MIN_VALUE;
                int noTabletCounter = 0;
                for (int i = 0; i < N; i++) {
                    int W = in.readInt();
                    int H = in.readInt();
                    int P = in.readInt();
                    if (P > B) {
                        noTabletCounter++;
                    } else {
                        max = Math.max(max, W * H);
                    }
                }
                out.printLine(noTabletCounter == N ? "no tablet" : max);
            }
            out.flush();
            out.close();
        } catch (Exception e) {
        }
    }
}

