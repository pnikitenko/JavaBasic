package ru.ibs.sreda;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Переводим рубли в доллары");
        System.out.println("Введите текущий курс доллара $: ");
        float currencyRate = input.nextFloat();

        System.out.println("Введите количество рублей: ");
        float rub = input.nextFloat();

        float result = rub / currencyRate;

        System.out.printf("Курс $: %2.2f\nКоличество рублей: %2.2f\nИтого: %2.2f долларов", currencyRate, rub, result);
    }
}
