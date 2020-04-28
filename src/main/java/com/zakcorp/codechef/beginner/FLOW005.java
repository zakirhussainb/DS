package com.zakcorp.codechef.beginner;

class FLOW005 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int num = in.readInt();
                System.out.println(new Solver().solve(num));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int num) {
            int counter = 0;
            int[] arr = {1, 2, 5, 10, 50, 100};
            for(int i = arr.length - 1; i >= 0; i--) {
                if(arr[i] <= num) {
                    int div = num / arr[i];
                    counter = counter + div;
                    num = num % arr[i];
                }
            }
            return counter;
        }
    }
}

