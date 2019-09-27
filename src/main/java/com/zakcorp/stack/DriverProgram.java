package com.zakcorp.stack;

public class DriverProgram {
    public static void main(String[] args) {
        StackI<Integer> stack = new LLStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.print();
        int pop = stack.pop();
        System.out.println("pop..." + pop);
        stack.print();
        System.out.println(stack.peek());
        stack.print();
        System.out.println(stack.peek(3));
        stack.print();

    }
}
