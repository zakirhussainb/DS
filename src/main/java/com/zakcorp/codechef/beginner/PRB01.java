package com.zakcorp.codechef.beginner;

class PRB01 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int num = in.readInt();
                System.out.println(new Solver().solve1(num));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int num) {
            if(num <= 1){
                return "no";
            }
            for(int i = 2; i < num; i++) {
                if(num % i == 0){
                    return "no";
                }
            }
            return "yes";
        }
        public String solve1(int num) {
            if(num <= 1){
                return "no";
            }
            for(int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0){
                    return "no";
                }
            }
            return "yes";
        }
    }
}

