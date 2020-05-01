package com.zakcorp.codechef.beginner;

class CHN09 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                out.printLine(new Solver().solve(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(String str){
            int aCount = 0, bCount = 0;
            char[] chars = str.toCharArray();
            for(Character ch : chars) {
                if(ch == 'a'){
                    aCount++;
                } else if(ch == 'b'){
                    bCount++;
                }
            }
            return Math.min(aCount, bCount);
        }
    }
}

