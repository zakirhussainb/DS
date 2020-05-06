package com.zakcorp.codechef.beginner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CODERLIF {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = 30;
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                     arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve(arr, n));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int n) {
            for(int i = 0; i < n; i++) {
                int counter = 0;
                if(arr[i] == 1) {
                    counter++;
                    int k = i + 1;
                    while(k < n && k < i + 7) {
                        if(arr[k] == 1) {
                            counter++;
                        } else if(arr[k] == 0 && counter < 6) {
                            break;
                        }
                        k++;
                    }
                }
                if(counter > 5) {
                    return "#coderlifematters";
                }
            }
            return "#allcodersarefun";
        }
    }
}

