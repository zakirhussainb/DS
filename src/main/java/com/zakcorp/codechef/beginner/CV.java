package com.zakcorp.codechef.beginner;

class CV {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String str = in.readString();
                out.printLine(new Solver().solve(N, str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N, String str) {
            int counter = 0;
            for(int i = 1; i < N; i++) {
                if(isVowel(str.charAt(i))){
                    if(!isVowel(str.charAt(i - 1))){
                        counter++;
                    }
                }
            }
            return counter;
        }
        public boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u';
        }
    }
}

