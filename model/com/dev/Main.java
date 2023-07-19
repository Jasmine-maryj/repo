package com.dev;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int add = calculator.add(5, 4);
        System.out.println("The sum of two number is: "+add);
        int sub = calculator.sub(5, 1);
        System.out.println("The subtraction of two number is: "+sub);
    }
}
