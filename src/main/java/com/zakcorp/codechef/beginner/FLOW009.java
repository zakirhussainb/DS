package com.zakcorp.codechef.beginner;

import java.text.DecimalFormat;

class FLOW009 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int quantity = in.readInt();
                int price = in.readInt();
                String result = String.format("%.6f", new Solver().solve(quantity, price));
                System.out.println(result);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public double solve(double quantity, double price) {
            if(quantity > 1000) {
                double discount = (quantity * 10) / 100;
                double discountedPrice = quantity - discount;
                return discountedPrice * price;
            } else {
                return quantity * price;
            }
        }
    }
}

