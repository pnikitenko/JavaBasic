package ru.ibs.sreda;

public class DataTask12 {
    public static void main(String[] args) {
        final String INPUT_STRING = "I like Java!!!";

        checkString(INPUT_STRING);

        String replacedStr = INPUT_STRING.replace('a', 'o');
        System.out.println(replacedStr.substring(7, 11));
    }

    public static void checkString(String input) {

        boolean assumption1 = input.contains("Java");
        boolean assumption2 = input.startsWith("I like");
        boolean assumption3 = input.endsWith("!!!");

        if (assumption1 && assumption2 && assumption3) {
            System.out.println(input.toUpperCase());
        }
    }
}
