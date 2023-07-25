package com.dev;

import java.util.Scanner;

public class Calculator {
    public int calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation you want to perform(+, -, /, *)");
        String ch = sc.next();
        int result = 0;
        switch(ch){
            case "+": result = num1 + num2;
                        break;
            case "-": result = num1 - num2;
                        break;
            case "*": result = num1 * num2;
                        break;
            case "/": result = num1 / num2;
                        break;
            default: 
                System.out.println("invalid operation");
        }
        return result;
    }
}

