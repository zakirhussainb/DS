package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class LAPIN {
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
            String firstHalf;
            String secHalf;
            int n = str.length();
            int div = n / 2;
            firstHalf = str.substring(0, div);
//            secHalf = (n % 2 == 0) ? str.substring(div) : str.substring(div + 1);
            secHalf = str.substring( (n + 1) / 2);
            char[] arr1 = firstHalf.toCharArray();
            char[] arr2 = secHalf.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String s1 = new String(arr1);
            String s2 = new String(arr2);
            return s1.equals(s2) ? "YES" : "NO";
        }
    }
}

