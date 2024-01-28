package ru.ibs.sreda;

import java.util.Scanner;

public class CyclesTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Вводим размер массива: ");
        double[] array = new double[input.nextInt()];

        System.out.println("Вводим значение типа double: ");
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextDouble();
                sum += array[i];
            }
            average = sum / array.length;
            System.out.println("Среднее арифметическое элементов массива: " + average);
        }

        for (double e : array) {
            System.out.println("Результат: " + e * average);
        }
    }
}
