package com.zakcorp.codechef.beginner;

import java.util.regex.*;

class CHEFROUT {
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
        Pattern pattern = Pattern.compile("^C*E*S*$");
        Matcher matcher;
        public String solve(String str) {
            int n = str.length();
            boolean result = true;
            for(int i = 1; i < n; i = i + 3) {
                if(str.charAt(i) < str.charAt(i - 1)){
                    result = false;
                    break;
                }
            }
            return result ? "yes" : "no";
        }
        public String solve1(String str) {
            matcher = pattern.matcher(str);
            return matcher.find() ? "yes" : "no";
        }
    }
}

