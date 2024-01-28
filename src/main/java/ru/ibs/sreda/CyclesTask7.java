package ru.ibs.sreda;

import java.util.Scanner;

public class CyclesTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int x = 100;
        final int y = 1000000;
        final int z = 1;

        System.out.println("Вводим размер массива: ");
        int arrSize = input.nextInt();

        int[] array = new int[arrSize];

        System.out.println("Вводим число, которое хотим добавить в массив: ");

        for (int i = 0; i < arrSize; i++) {
            array[i] = input.nextInt();
            if (array[i] == x  || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах :(");
                System.out.println("Пробуем другое число: ");
                array[i] = input.nextInt();
            }
        }
    }
}
