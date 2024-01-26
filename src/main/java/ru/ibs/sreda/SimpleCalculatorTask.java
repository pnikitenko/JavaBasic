package ru.ibs.sreda;

import java.util.Scanner;

public class SimpleCalculatorTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ввод первого числа: ");
        int num1 = input.nextInt();

        System.out.print("Ввод второго числа: ");
        int num2 = input.nextInt();

        System.out.print("Ввод оператора +, -, * или / : ");
        String operator = input.next();

        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result =  num1 / num2;
                } else {
                    System.out.println("На ноль не делим");
                    return;
                }
                break;

            default:
                System.out.println("Это мы не проходили, это нам не задавали");
                return;
        }
        System.out.println("Результат: " + result);
    }
}
