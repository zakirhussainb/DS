package com.zakcorp.codechef.beginner;

class FLOW011 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                double salary = in.readInt();
                System.out.println(new Solver().solve(salary));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public double solve(double salary) {
            double grossSalary, hra, da;
            if(salary < 1500) {
                hra = salary * 0.10;
                da = salary * 0.90;
            } else {
                hra = 500;
                da = salary * 0.98;
            }
            grossSalary = salary + hra + da;
            return grossSalary;
        }
    }
}

