package com.zakcorp.codechef.beginner;

class VILTRIBE {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                new Solver().solve(str);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public void solve(String str){
//            A..A..B...B
            int n = str.length();
            int aCounter = 0;
            int bCounter = 0;
            int dotCounter = 0;
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == 'A') {
                    aCounter++;
                } else if(str.charAt(i) == 'B') {
                    bCounter++;
                } else if(str.charAt(i) == '.') {
                    dotCounter++;
                }
            }
        }
    }
}
