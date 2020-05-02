package com.zakcorp.codechef.beginner;

import java.util.Stack;

class CHEFSTLT {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str1 = in.readString();
                String str2 = in.readString();
                out.printLine(new Solver().solve(str1, str2));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str1, String str2) {
            int min = 0;
            int max = 0;
            int n = str1.length();
            for(int i = 0; i < n; i++){
                if( (Character.isLetter(str1.charAt(i)) && str2.charAt(i) == '?') || (Character.isLetter(str2.charAt(i)) && str1.charAt(i) == '?')) {
                    max++;
                } else if(str1.charAt(i) == '?' && str2.charAt(i) == '?'){
                    max++;
                } else if( str1.charAt(i) != str2.charAt(i) ) {
                    max++;
                    min++;
                }
            }
            return min + " " + max;
        }
    }
}

