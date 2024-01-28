package ru.ibs.sreda;

import java.util.Scanner;

public class CyclesTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Придумайте любое целое положительное число: ");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Посчитаем, состоятельные кроты!");
        System.out.println("Сумма нечётных чисел равна: " + sum);
    }
}
