package com.zakcorp.codechef.beginner;

class FLOW009 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int quantity = in.readInt();
                int price = in.readInt();
                System.out.println(new Solver().solve(quantity, price));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public double solve(double quantity, double price) {
            double expense = quantity * price;
            return expense;
        }
    }
}

