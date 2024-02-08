package ru.ibs.sreda;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите уравнение: ");
        String eq = input.next();

        if (!(eq.length() == 5)) {
            System.out.println("Строка должна быть длиной 5 символов. Попробуйте снова.");
            eq = input.next();
        }

        String[] eqEl = eq.split("");

        final String X = "x";
        final String PLUS = "+";
        final String MINUS = "-";
        final boolean IS_PLUS = eqEl[1].equals(PLUS);
        final boolean IS_MINUS = eqEl[1].equals(MINUS);
        final boolean IS_EQUALS = eqEl[3].equals("=");
        final boolean IS_X_ON_POS_0 = eqEl[0].equals(X);
        final boolean IS_X_ON_POS_2 = eqEl[2].equals(X);
        final boolean IS_X_AFTER_EQUALS = eqEl[4].equals(X);
        final boolean HAS_X = eq.contains(X);


        if (!IS_PLUS && !IS_MINUS || !IS_EQUALS || !HAS_X) {
            System.out.println("Это мы не проходили. Попробуйте снова.");
            return;
        }

        int pos0 = 0;
        int pos2 = 0;
        int pos4 = 0;

        if (IS_X_AFTER_EQUALS) {
            pos0 = Integer.parseInt(eqEl[0]);
            pos2 = Integer.parseInt(eqEl[2]);
        } else if (IS_X_ON_POS_0) {
            pos2 = Integer.parseInt(eqEl[2]);
            pos4 = Integer.parseInt(eqEl[4]);
        } else {
            pos0 = Integer.parseInt(eqEl[0]);
            pos4 = Integer.parseInt(eqEl[4]);
        }

        int result;

        if (IS_MINUS && !IS_X_ON_POS_2) {
            pos2 *= -1;
        }

        if (IS_X_ON_POS_0) {
            result = calc(MINUS, pos4, pos2);
        } else if (IS_X_AFTER_EQUALS) {
            result = calc(PLUS, pos0, pos2);
        } else {
            result = calc(MINUS, pos4, pos0);
            if (IS_MINUS) {
                result *= -1;
            }
        }
        System.out.println(result);
    }

    public static int calc(String operator, int value1, int value2) {
        final String PLUS = "+";
        final String MINUS = "-";

        int result = 0;
        switch (operator) {
            case PLUS:
                result = value1 + value2;
                break;
            case MINUS:
                result = value1 - value2;
                break;
        }
        return result;
    }
}
