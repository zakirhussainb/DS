package com.zakcorp.books.karumachi;

public class PowerOf {
    // Recursion - Taken from abdul Bari notes
    // Similar to Math.pow() method
    public static void main(String[] args) {
        PowerOf p = new PowerOf();
        System.out.println("recur..." + p.recurSol(0, 0));
        System.out.println("recur..." + p.recurSol2(2, 10));
        System.out.println("iter..." + p.iterSol(2, 3));
    }
    public int recurSol(int m, int n) {
        if(m <= 0 || n <= 0) {
            return 1;
        }
        return recurSol(m, n - 1) * m;
    }
    // faster and efficient version for recursive solution.
    public int recurSol2(int m, int n) {
        if(m <= 0 || n <= 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return recurSol2(m * m, n / 2);
        } else {
            return m * recurSol2(m * m, (n - 1) / 2);
        }
    }

    public int iterSol(int m, int n) {
        if(m <= 0 || n <= 0) {
            return 1;
        }
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= m;
        }
        return result;
    }
}
