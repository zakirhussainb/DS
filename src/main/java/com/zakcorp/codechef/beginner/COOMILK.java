package com.zakcorp.codechef.beginner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class COOMILK {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String[] strArr = new String[N];
                for(int i = 0; i < N; i++) {
                    strArr[i] = in.readString();
                }
                out.printLine(new Solver().solve(strArr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    static class Solver {
        public String solve(String[] strArr, int N) {
            if(N < 2) {
                return strArr[0].equals("cookie") ? "NO" : "YES";
            }
            for(int i = 1; i < N; i++) {
                if( strArr[i - 1].equals("cookie") && !strArr[i].equals("milk") ) {
                    return "NO";
                }
            }
            if(strArr[N - 1].equals("cookie")) {
                return "NO";
            }
            return "YES";
        }
    }
}

