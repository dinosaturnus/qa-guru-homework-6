package com.dinosaturnus;

// Работа с типом данных int и операторами %, >, ==, &&,  if..else на примре задачи:
//    Создать программу, которая будет проверять, является ли число,
//    введённое пользователем, целым и больше 0,
//    а в случае позитивного сценария сообщать, число чётное или нечётное.
//Чтобы не нагружать программу, не стала прописывать подробные условия для сценариев,
//когда введено не целое число, а строка или дробь, или число не из диапазона int.
//Объединила все эти проверки в проверку hasNextInt().

import java.util.Scanner;

public class OperatorsAndCalculations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число больше 0 и нажмите enter: ");

        if (scan.hasNextInt()) {
            int numberToCheck = scan.nextInt();
            if (numberToCheck > 0 && numberToCheck % 2 == 0) {
                System.out.println("Вы ввели чётное число.");
            } else if (numberToCheck > 0 && numberToCheck % 2 == 1) {
                System.out.println("Вы ввели нечётное число.");
            } else {
                System.out.println("Допустим ввод только целых чисел больше 0. Попробуйте снова.");
            }
        } else {
            System.out.println("Допустим ввод только целых чисел больше 0. Попробуйте снова.");
        }

        scan.close();
    }

}
