package com.zakcorp.codechef.beginner;

class RECNDSTR {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                int n = str.length();
                out.printLine(new Solver().solve(str, n));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str, int n) {
            if(n <= 2)
                return "YES";
            String left = str.substring(1) + str.charAt(0);
            String right = str.charAt(n - 1) + str.substring(0, n - 1);
            return left.equals(right) ? "YES" : "NO";
        }
    }
}

