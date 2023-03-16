package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;

        do {
            System.out.print("Enter what action do you want to perform? choose: +, -, / or *: ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
                break;
            } else {
                System.out.println("Wrong operator!");
            }
        } while (true);

        do {
            System.out.print("Enter first number: ");
            if (scanner.hasNextDouble()) {
                number1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please enter a number.");
                scanner.next();
            }
        } while (true);

        do {
            System.out.print("Enter second number: ");
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble();
                if (operator == '/' && number2 == 0) {
                    System.out.println("Can't divide by 0!");
                    continue;
                }
                break;
            } else {
                System.out.println("Please enter a number.");
                scanner.next();
            }
        } while (true);

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
