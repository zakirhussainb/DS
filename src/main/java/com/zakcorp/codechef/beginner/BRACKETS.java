package com.zakcorp.codechef.beginner;

class BRACKETS {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                System.out.println(new Solver().solve(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str) {
            StringBuilder sb = new StringBuilder();
            int limit = getLengthOfB(str);
            for(int i = 1; i <= limit; i++) {
                sb.append('(');
            }
            for(int i = 1; i <= limit; i++) {
                sb.append(')');
            }
            return sb.toString();
        }
        private int getLengthOfB(String str) {
            int bal = 0;
            int maxBal = 0;
            int n = str.length();
            for(int i = 0; i < n; i++) {
                bal = (str.charAt(i) == '(') ? bal + 1 : bal - 1;
                maxBal = Math.max(maxBal, bal);
            }
            return maxBal;
        }
    }
}

