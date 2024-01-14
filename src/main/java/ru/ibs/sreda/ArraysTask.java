package ru.ibs.sreda;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int[] arr = {36, 83478, 820, 142, 3691};
        int el = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = el;

        int sum = arr[0] + arr[arr.length / 2];

        System.out.println("Сумма первого и среднего элементов массива: " + sum);
    }

}
