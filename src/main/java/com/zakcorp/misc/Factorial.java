package com.zakcorp.misc;

public class Factorial {
    // Recursion - Taken from abdul Bari notes
    public static void main(String[] args) {
        Factorial p = new Factorial();
        System.out.println(p.recursiveSol(5));
        System.out.println(p.iterSol(0));
    }
    public int recursiveSol(int num) {
        if(num <= 0) {
            return 1;
        } else {
            return recursiveSol(num - 1) * num;
        }
    }
    public int iterSol(int num) {
        if(num <= 0){
            return 1;
        }
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
