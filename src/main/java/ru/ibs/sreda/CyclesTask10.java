package ru.ibs.sreda;

import java.util.Scanner;

public class CyclesTask10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Зададим размерность матрицы");
        System.out.println("Введём количество строк: ");
        int rows = input.nextInt();

        System.out.print("Введём количество столбцов: ");
        int columns = input.nextInt();

        System.out.println("Введём данные в матрицу:");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int j = 0; j < columns; j++) {
            System.out.println(matrix[0][j] * 3);
        }
    }
}
