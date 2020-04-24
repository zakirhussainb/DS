package com.zakcorp.codechef.beginner;

class RECIPE {
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
            String[] splitArr = str.split("\\s+");
            int[] arr = new int[splitArr.length];
            int n = arr.length;
            return "";
        }
    }
}

