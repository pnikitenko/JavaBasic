package ru.ibs.sreda;

import java.util.Scanner;

public class ConverterTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите конвертер величин: 1 - масса, 2 - расстояние: ");

        final int IS_WEIGHT_TYPE = 1;
        final int IS_DISTANCE_TYPE = 2;

        int convType = in.nextInt();

        System.out.print("Выберите единицу измерения: ");
        switch (convType) {
            case IS_WEIGHT_TYPE:
                System.out.println("1 - килограмм, 2 - фунт, 3 - унция");
                break;
            case IS_DISTANCE_TYPE:
                System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                break;
            default:
                System.out.println("Единица измерения пока не поддерживается");
                return;
        }

        int measure = in.nextInt();

        System.out.println("Введите количество единиц: ");
        double quantity = in.nextInt();

        switch (convType) {
            case IS_WEIGHT_TYPE:
                weightConverter(measure, quantity);
                break;
            case IS_DISTANCE_TYPE:
                distanceConverter(measure, quantity);
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }

    private static void weightConverter(int measure, double quantity) {
        String[] unitNames = {"Килограммы", "Фунты", "Унции"};
        double[][] k = {{1, 2.20462, 35.274}, {0.45359, 1, 15.99999}, {0.02835, 0.0625, 1}};

        for (int i = 0; i < unitNames.length; ++i) {
            System.out.printf("%s: %f\n", unitNames[i], k[measure - 1][i] * quantity);
        }
    }

    private static void distanceConverter(int measure, double quantity) {
        String[] unitNames = {"Метры", "Мили", "Ярды", "Футы"};
        double[][] k = {{1, 0.00062, 1.094, 3.281}, {1609, 1, 1760, 5280}, {0.9144, 0.00057, 1, 3}, {0.3048, 0.00019, 0.3333, 1}};

        for (int i = 0; i < unitNames.length; ++i) {
            System.out.printf("%s: %f\n", unitNames[i], k[measure - 1][i] * quantity);
        }
    }
}
