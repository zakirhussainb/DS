package com.zakcorp.codechef.beginner;

class EXAM1 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String str1 = in.readString();
                String str2 = in.readString();
                out.printLine(new Solver().solve(N, str1, str2));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int N, String str1, String str2) {
            int score = 0;
            for(int i = 0, j = 0; i < N && j < N; i++, j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    score++;
                } else if(str2.charAt(j) == 'N'){
                    continue;
                } else {
                    i++;
                    j++;
                }
            }
            return score;
        }
    }
}

