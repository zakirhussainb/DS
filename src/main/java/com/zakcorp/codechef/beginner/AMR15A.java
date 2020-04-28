package com.zakcorp.codechef.beginner;

class AMR15A {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int N = in.readInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++)  {
                arr[i] = in.readInt();
            }
            System.out.println(new Solver().solve(arr));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr) {
            int evenCount = 0;
            int oddCount = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            return (evenCount > oddCount) ? "READY FOR BATTLE" : "NOT READY";
        }
    }
}

