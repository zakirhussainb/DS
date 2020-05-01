package com.zakcorp.codechef.beginner;

class FRK {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        String[] chefArr = {"ch", "he", "ef"};
        try {
            int N = in.readInt();
            int counter = 0;
            for(int i = 0; i < N; i++) {
                String str = in.readString();
                counter = counter + new Solver().solve(str, chefArr);
            }
            out.printLine(counter);
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(String str, String[] chefArr) {
            for(String s : chefArr) {
                if(str.contains(s))
                    return 1;
            }
            return 0;
        }
    }
}

