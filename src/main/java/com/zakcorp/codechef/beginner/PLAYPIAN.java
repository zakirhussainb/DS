package com.zakcorp.codechef.beginner;

class PLAYPIAN {
    public static void main(String[] args) {
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
        public String solve(String str) {
            int counter = 0;
            int n = str.length();
            for(int i = 0; i < n; i = i + 2) {
                if(str.charAt(i) != str.charAt(i + 1))
                    counter++;
                else
                    return "no";
            }
            return (n / counter == 2) ? "yes" : "no";
        }
    }
}

