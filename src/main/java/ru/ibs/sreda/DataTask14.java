package ru.ibs.sreda;

public class DataTask14 {
    public static void main(String[] args) {

        int[] array = new int[15];

        final int MIN_BOUND = -20;
        final int MAX_BOUND = 20;

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(MIN_BOUND, MAX_BOUND);
        }

        int max = 0;
        int min = 0;

        for (int element : array) {
            max = Math.max(max, element);
            min = Math.min(min, element);
        }

        int maxAbs = Math.max(Math.abs(min), Math.abs(max));

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Наибольшее значение по модулю из максимального и минимального: " + maxAbs);

    }

    public static int getRandom(int min, int max) {
        int diapason = max + Math.abs(min) + 1;
        return (int) (Math.random() * diapason) - max;
    }
}
