package ru.ibs.sreda;

import java.util.Scanner;

public class DataTask13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введём слова, разделяя их пробелами. Можно вводить слова кириллицей или латиницей.");

        String[] words = input.nextLine().split(" ");

        int counter = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println("" + word);
                counter++;
            }
        }
        System.out.println("Число слов, состоящих только из латиницы: " + counter);
    }
}
