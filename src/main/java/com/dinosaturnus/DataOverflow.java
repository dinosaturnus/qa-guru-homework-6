package com.dinosaturnus;

// Переполнение данных и вывод результата в консоль

public class DataOverflow {

    public static void main(String[] args) {

        // тип byte (8 бит). Диапазон -128...127 или (-2^(8-1))...((2^7)-1)
        byte numberOneByte = 55;
        byte numberTwoByte = 100;
        byte sumByte = (byte) (numberOneByte + numberTwoByte);
        System.out.println("Сумма чисел 55 и 100 типа byte равна " + sumByte);

        // тип short (16 бит). Диапазон -32768...32767 или (-2^(16-1))...((2^15)-1)
        short numberOneShort = 32100;
        short numberTwoShort = 10000;
        short productShort = (short) (numberOneShort * numberTwoShort);
        System.out.println("Произведение чисел 32100 и 10000 типа short равно " + productShort);

        // тип int (32 бит). Диапазон -2147483648...2147483647 или (-2^(32-1))...((2^31)-1)
        int numberOneInt = 2147483600;
        int numberTwoInt = 90000000;
        int sumInt = numberOneInt + numberTwoInt;
        System.out.println("Сумма чисел 2147483600 и 90000000 типа int равна " + sumInt);

        // тип long (64 бит). Диапазон -9223372036854775808...9223372036854775807 или (-2^(64-1))...((2^63)-1)
        long numberOneLong = -92233720368547758L;
        long numberTwoLong = -9223372036854775808L;
        long differenceLong = numberOneLong - numberTwoLong;
        System.out.println("Разница чисел -92233720368547758 и -9223372036854775808 типа long равна " + differenceLong);

    }

}
