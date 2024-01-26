package ru.ibs.sreda;

import java.util.Scanner;

public class OperatorsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ввод первого числа: ");
        int x = input.nextInt();

        System.out.print("Ввод второго числа: ");
        int y = input.nextInt();

        System.out.print("Ввод третьего числа: ");
        int z = input.nextInt();


        int average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);

        int averageDivided = (average / 2);

        if (averageDivided > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
