package ru.ibs.sreda;

import java.util.Scanner;

public class DataTask11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введём первое число: ");
        String num1 = input.nextLine();

        System.out.println("Введём второе число: ");
        int num2 = input.nextInt();

        System.out.println("Наибольшее из двух чисел: " + Math.max(Integer.parseInt(num1), num2));

        double minNum = Math.min(Integer.parseInt(num1), num2);
        System.out.println("Наименьшее из двух чисел: " + minNum);
    }
}
