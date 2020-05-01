package com.zakcorp.codechef.beginner;

class POTATOES {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int x = in.readInt();
                int y = in.readInt();
                out.printLine(new Solver().solve(x, y));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int x, int y){
            int result;
            int z = x + y;
            for(int i = z + 1; ; i++) {
                if(isPrime(i)) {
                    result = i - z;
                    break;
                }
            }
            return result;
        }
        public boolean isPrime(int num) {
            if(num <= 1){
                return false;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}

