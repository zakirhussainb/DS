package com.zakcorp.codechef.beginner;

class BUGCAL {
    public static void main(String[] args) throws Exception {
//        new Solver1().solve();
        new Solver2().solve();
    }
    static class Solver1 {
        public void solve() {
            InputReader in = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
            try {
                int tc = in.readInt();
                while(tc --> 0) {
                    int a = in.readInt();
                    int b = in.readInt();
                    char[] chArr = getSum(a, b).toCharArray();
                    boolean nz = false;
                    // this for is used to print the sum
                    for(char ch : chArr) {
                        if(ch != '0')
                            nz = true;
                        if(nz)
                            out.print(ch);
                    }
                    out.printLine(nz ? "" : 0);
                }
                out.flush();
                out.close();
            } catch (Exception e){
            }
        }
        private String getSum(int a, int b) {
            StringBuilder sb = new StringBuilder();
            while(a != 0 || b != 0) {
                sb.append((a % 10 + b % 10) % 10);
                a /= 10;
                b /= 10;
            }
            return sb.reverse().toString();
        }
    }
    static class Solver2 {
        public void solve() {
            InputReader in = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
            try {
                int tc = in.readInt();
                while(tc --> 0) {
                    long a = in.readInt();
                    long b = in.readInt();
                    out.printLine(getSum2(a, b));
                }
                out.flush();
                out.close();
            } catch (Exception e){
            }
        }
        private long getSum2(long a, long b) {
            long sum = 0L, i = 0;
            while(a > 0 || b > 0) {
                sum += ((a + b) % 10) * Math.pow(10, i);
                a /= 10;
                b /= 10;
                i++;
            }
            return sum;
        }
    }
}

