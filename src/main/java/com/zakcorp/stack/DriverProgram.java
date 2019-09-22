package com.zakcorp.stack;

public class DriverProgram {
    public static void main(String[] args) {
        StackI<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
    }
}
