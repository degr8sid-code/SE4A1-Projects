package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========|| SIMPLE CALCULATOR ||========");
        System.out.println();
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int num1, num2;
        num1 = sc.nextInt();
        System.out.print("Enter second1 numbers: ");
        num2 = sc.nextInt();

        int option;
        System.out.println("Enter Option || 1) + , 2) * , 3) - , 4) / ||");
        option = sc.nextInt();
        if(option == 1) {
            calculator.add(num1, num2);
        }
        else if (option == 2) {
            calculator.mul(num1 , num2);

        } else if (option == 3) {
            calculator.sub(num1, num2);

        } else if (option == 4) {
            calculator.div(num1, num2);
        }

        else
            System.out.printf("Invalid Number");

        sc.close();
    }
}