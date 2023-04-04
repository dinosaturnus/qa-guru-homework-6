package com.dinosaturnus;

// Операции с целочисленными и дробными типами.

public class CalculationWithIntAndDouble {

    public static void main(String[] args) {

        // сумма int и double
        int numberInt = 19;
        double numberDouble = 2.983;
        System.out.println("Сумма целого числа типа int 19 и дробного числа типа double 2.983 равна " + ((double) numberInt + numberDouble));

        // произведение int и double
        int numberIntOne = 0;
        double numberDoubleOne = 34.12;
        System.out.println("Произведение целого числа типа int 0 и дробного числа типа double 34.12 равно " + ((double) numberIntOne * numberDoubleOne));

        // частное int и double
        int numberIntTwo = 53;
        double numberDoubleTwo = 1.20394;
        System.out.println("Частное целого числа типа int 53 и дробного числа типа double 1.20394 равно " + ((double) numberIntTwo / numberDoubleTwo));
    }

}
